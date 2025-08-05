// Add the SQLite JDBC driver to your project dependencies
// Maven: <dependency><groupId>org.xerial</groupId><artifactId>sqlite-jdbc</artifactId><version>3.42.0.0</version></dependency>
// Or download the JAR and add it to your classpath.
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class KairovaApp {
    static Scanner scanner = new Scanner(System.in);

    // In-memory collections for quick access (loaded from DB)
    static Map<String, User> users = new HashMap<>();
    static List<Teacher> teachers = new ArrayList<>();
    static List<ContentWritingSuggestion> contentWritingSuggestions = new ArrayList<>();

    // Database file name
    private static final String DB_URL = "jdbc:sqlite:kairova.db";

    public static void main(String[] args) {
        // Initialize database and load data at startup
        initDatabase();
        loadData();

        try {
            System.out.println("Welcome to KAIROVA - Student Career Guideline & Mental Wellness Portal");
            while (true) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("Select your role to login:");
                System.out.println("1. Student");
                System.out.println("2. Teacher");
                System.out.println("3. Admin");
                System.out.println("4. Register as Student");
                System.out.println("5. Register as Teacher");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                String roleChoice = scanner.nextLine().trim();

                if (roleChoice.equals("6")) {
                    System.out.println("Goodbye! Thank you for using KAIROVA.");
                    return;
                }

                String expectedRole = null;
                switch (roleChoice) {
                    case "1": expectedRole = "student"; break;
                    case "2": expectedRole = "teacher"; break;
                    case "3": expectedRole = "admin"; break;
                    case "4":
                        registerNewUser("student");
                        continue;
                    case "5":
                        registerNewUser("teacher");
                        continue;
                    default:
                        System.out.println("Invalid option. Please enter a number between 1 and 6.");
                        continue;
                }

                // Login for the selected role
                boolean isLoggedIn = false;
                int attempts = 0;
                while (!isLoggedIn && attempts < 3) {
                    System.out.println();
                    System.out.println("Login Required for " + capitalize(expectedRole));
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine().trim();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine().trim();

                    isLoggedIn = LoginSystem.login(username, password);
                    if (isLoggedIn && !LoginSystem.getCurrentUser().getRole().equals(expectedRole)) {
                        System.out.println("Access denied. This username is registered for a different role.");
                        LoginSystem.logout();
                        isLoggedIn = false;
                    }
                    if (!isLoggedIn) {
                        attempts++;
                        System.out.println("Invalid credentials or incorrect role. " + (3 - attempts) + " attempts remaining.");
                    }
                }

                if (!isLoggedIn) {
                    System.out.println("Maximum attempts reached for " + expectedRole + " login. Please try again.");
                    continue;
                }

                // Role-specific portal access
                switch (roleChoice) {
                    case "1": handleStudent(); break;
                    case "2": handleTeacher(); break;
                    case "3": handleAdmin(); break;
                }
                LoginSystem.logout();
            }
        } finally {
            scanner.close();
        }
    }

    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    // --- Database Initialization ---
    private static void initDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                System.out.println("Connected to SQLite database.");
                createTables(conn);
            }
        } catch (SQLException e) {
            System.err.println("Error initializing database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void createTables(Connection conn) throws SQLException {
        String createUserTable = """
            CREATE TABLE IF NOT EXISTS users (
                username TEXT PRIMARY KEY,
                password TEXT NOT NULL,
                role TEXT NOT NULL
            );
            """;

        String createTeacherTable = """
            CREATE TABLE IF NOT EXISTS teachers (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT UNIQUE NOT NULL,
                subject TEXT
            );
            """;

        String createTeacherDetailsTable = """
            CREATE TABLE IF NOT EXISTS teacher_details (
                teacher_name TEXT PRIMARY KEY,
                demo_videos TEXT,
                schedule TEXT,
                FOREIGN KEY (teacher_name) REFERENCES teachers(name) ON DELETE CASCADE
            );
            """;

        String createContentWritingSuggestionsTable = """
            CREATE TABLE IF NOT EXISTS content_writing_suggestions (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                title TEXT NOT NULL,
                description TEXT,
                target_age_group TEXT
            );
            """;

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createUserTable);
            stmt.execute(createTeacherTable);
            stmt.execute(createTeacherDetailsTable);
            stmt.execute(createContentWritingSuggestionsTable);
            System.out.println("Database tables created or verified.");
        }
    }

    // --- Data Loading from Database ---
    private static void loadData() {
        loadUsers();
        loadTeachers();
        loadContentWritingSuggestions();
    }

    private static void loadUsers() {
        String sql = "SELECT username, password, role FROM users";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            users.clear();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                users.put(username, new User(username, password, role));
            }
            System.out.println("Users loaded from database.");
        } catch (SQLException e) {
            System.err.println("Error loading users: " + e.getMessage());
        }
        if (users.isEmpty()) {
            initializeDefaultUsers();
            saveUsers();
        }
    }

    private static void loadTeachers() {
        String sql = "SELECT name, subject FROM teachers";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            teachers.clear();
            Map<String, Teacher> teacherMap = new HashMap<>();
            while (rs.next()) {
                String name = rs.getString("name");
                String subject = rs.getString("subject");
                Teacher t = new Teacher(name, subject);
                teachers.add(t);
                teacherMap.put(name, t);
            }
            System.out.println("Teachers (basic info) loaded from database.");
            loadTeacherDetails(teacherMap);
        } catch (SQLException e) {
            System.err.println("Error loading teachers: " + e.getMessage());
        }
    }

    private static void loadTeacherDetails(Map<String, Teacher> teacherMap) {
        String sql = "SELECT teacher_name, demo_videos, schedule FROM teacher_details";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String name = rs.getString("teacher_name");
                Teacher t = teacherMap.get(name);
                if (t != null) {
                    String demoVideosStr = rs.getString("demo_videos");
                    String scheduleStr = rs.getString("schedule");
                    if (demoVideosStr != null && !demoVideosStr.isEmpty()) {
                        t.demoVideoURLs.addAll(Arrays.asList(demoVideosStr.split(",")));
                    }
                    if (scheduleStr != null && !scheduleStr.isEmpty()) {
                        t.schedule.addAll(Arrays.asList(scheduleStr.split(",")));
                    }
                }
            }
            System.out.println("Teacher details loaded from database.");
        } catch (SQLException e) {
            System.err.println("Error loading teacher details: " + e.getMessage());
        }
    }

    private static void loadContentWritingSuggestions() {
        String sql = "SELECT id, title, description, target_age_group FROM content_writing_suggestions";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            contentWritingSuggestions.clear();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String targetAgeGroup = rs.getString("target_age_group");
                contentWritingSuggestions.add(new ContentWritingSuggestion(id, title, description, targetAgeGroup));
            }
            System.out.println("Loaded " + contentWritingSuggestions.size() + " content writing suggestions from database.");
            if (contentWritingSuggestions.isEmpty()) {
                initializeDefaultContentWritingSuggestions();
                saveContentWritingSuggestions();
            }
        } catch (SQLException e) {
            System.err.println("Error loading content writing suggestions: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // --- Data Saving ---
    private static void saveUsers() {
        String insertSql = "INSERT OR REPLACE INTO users (username, password, role) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
            conn.setAutoCommit(false);
            for (User user : users.values()) {
                pstmt.setString(1, user.getUsername());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getRole());
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            conn.commit();
            System.out.println("Users saved to database.");
        } catch (SQLException e) {
            System.err.println("Error saving users: " + e.getMessage());
        }
    }

    private static void saveContentWritingSuggestions() {
        String insertSql = "INSERT INTO content_writing_suggestions (title, description, target_age_group) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
            conn.setAutoCommit(false);
            for (ContentWritingSuggestion suggestion : contentWritingSuggestions) {
                pstmt.setString(1, suggestion.getTitle());
                pstmt.setString(2, suggestion.getDescription());
                pstmt.setString(3, suggestion.getTargetAgeGroup());
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            conn.commit();
            System.out.println("Content writing suggestions saved to database.");
        } catch (SQLException e) {
            System.err.println("Error saving content writing suggestions: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // --- Default Data Initialization ---
    private static void initializeDefaultUsers() {
        if (!users.containsKey("admin123")) {
            users.put("admin123", new User("admin123", "admin123", "admin"));
        }
        if (!users.containsKey("teacher1")) {
            users.put("teacher1", new User("teacher1", "teacher1", "teacher"));
        }
        if (!users.containsKey("student1")) {
            users.put("student1", new User("student1", "student1", "student"));
        }
        if (users.containsKey("teacher1") && teachers.stream().noneMatch(t -> "teacher1".equals(t.name))) {
            teachers.add(new Teacher("teacher1", "Math"));
        }
        System.out.println("Default users initialized in memory.");
    }

    private static void initializeDefaultContentWritingSuggestions() {
        contentWritingSuggestions.clear();
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Book Review for Young Readers", "Write a short review (100-150 words) of a book you recently read. Include the title, author, a brief summary without spoilers, and your opinion.", "6-10"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "My Hero Story", "Write a short story (150-250 words) about a hero. It can be someone famous, someone you know, or even yourself! What makes them a hero?", "6-10"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "A Day in My Life Blog Post", "Imagine you're writing a blog post about a typical day in your life. Include interesting details, your feelings, and perhaps a photo description (even if you don't have one). Aim for 200-300 words.", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Argumentative Essay: School Uniforms", "Write a 300-400 word essay arguing for or against school uniforms. Present a clear thesis, supporting arguments, and a conclusion. Address potential counterarguments.", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Creative Non-Fiction: A Personal Challenge", "Describe a challenge you faced recently (academic, personal, social). Write 250-350 words in a narrative style, focusing on the experience and what you learned.", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Reflective Journal Entry: Future Goals", "Write a 200-300 word reflective piece on your short-term (next year) and long-term (10 years) goals. Why are these important to you? What steps can you take now?", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Opinion Piece: Technology in Education", "Write a 300-400 word opinion piece on how technology is changing education. Do you think the changes are mostly positive or negative? Support your view with examples.", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Profile Article: Interview a Local Figure", "Pretend you interviewed someone interesting in your community (teacher, shop owner, artist). Write a 300-400 word profile article highlighting their story and contributions.", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Creative Writing Prompt: The Last Library", "In a world where all books exist digitally, you discover the last physical library hidden underground. Write a 250-350 word story about your experience there.", "11-19"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Personal Statement Draft", "Draft a 300-400 word personal statement for a hypothetical college application or scholarship. Highlight your strengths, experiences, and goals.", "19+"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Research Summary: Climate Change Impact", "Summarize a recent article or report on climate change impacts in Bangladesh in 250-300 words. Focus on key findings and potential solutions.", "19+"));
        contentWritingSuggestions.add(new ContentWritingSuggestion(0, "Case Study Analysis: A Business Decision", "Analyze a well-known business decision (e.g., a product launch, market entry). Write 300-400 words discussing the strategy, outcome, and lessons learned.", "19+"));

        System.out.println("Default content writing suggestions initialized in memory.");
    }

    // --- Registration ---
    private static void registerNewUser(String role) {
        System.out.println("\n--- Register as " + capitalize(role) + " ---");
        System.out.print("Enter new username: ");
        String newUsername = scanner.nextLine().trim();
        if (newUsername.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }
        if (users.containsKey(newUsername)) {
            System.out.println("Username already exists. Please choose another.");
            return;
        }
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine().trim();
        if (newPassword.isEmpty()) {
            System.out.println("Password cannot be empty.");
            return;
        }

        User newUser = new User(newUsername, newPassword, role);
        users.put(newUsername, newUser);

        String sql = "INSERT OR IGNORE INTO users (username, password, role) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newUsername);
            pstmt.setString(2, newPassword);
            pstmt.setString(3, role);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println(capitalize(role) + " '" + newUsername + "' registered successfully.");
                if ("teacher".equalsIgnoreCase(role)) {
                    String teacherSql = "INSERT OR IGNORE INTO teachers (name, subject) VALUES (?, ?)";
                    try (PreparedStatement teacherPstmt = conn.prepareStatement(teacherSql)) {
                        teacherPstmt.setString(1, newUsername);
                        teacherPstmt.setString(2, "General");
                        teacherPstmt.executeUpdate();
                        teachers.add(new Teacher(newUsername, "General"));
                        System.out.println("Teacher profile created.");
                    }
                }
            } else {
                System.out.println("Registration might have failed.");
                users.remove(newUsername);
            }
        } catch (SQLException e) {
            System.err.println("Database error during registration: " + e.getMessage());
            users.remove(newUsername);
        }
    }

    private static void registerNewAdmin() {
        System.out.println("\n--- Register New Admin ---");
        System.out.print("Enter new admin username: ");
        String newAdminUsername = scanner.nextLine().trim();
        if (newAdminUsername.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }
        if (users.containsKey(newAdminUsername)) {
            System.out.println("Username already exists. Please choose another.");
            return;
        }
        System.out.print("Enter new admin password: ");
        String newAdminPassword = scanner.nextLine().trim();
        if (newAdminPassword.isEmpty()) {
            System.out.println("Password cannot be empty.");
            return;
        }

        User newAdminUser = new User(newAdminUsername, newAdminPassword, "admin");
        users.put(newAdminUsername, newAdminUser);

        String sql = "INSERT OR IGNORE INTO users (username, password, role) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newAdminUsername);
            pstmt.setString(2, newAdminPassword);
            pstmt.setString(3, "admin");
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Admin '" + newAdminUsername + "' registered successfully.");
            } else {
                System.out.println("Admin registration might have failed.");
                users.remove(newAdminUsername);
            }
        } catch (SQLException e) {
            System.err.println("Database error during admin registration: " + e.getMessage());
            users.remove(newAdminUsername);
        }
    }

    // --- Portals ---
    static void handleStudent() {
        System.out.println("\n--- Student Portal ---");
        System.out.print("Enter your age: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a number.");
            return;
        }

        if (age >= 6 && age <= 10) {
            System.out.println("\n--- Age Group: 6-10 (Basic Quiz) ---");
            Quiz.askBasicQuiz(scanner);

            System.out.println("\nWould you like some fun content writing ideas?");
            System.out.print("Enter 'yes' or 'no': ");
            String contentChoice = scanner.nextLine().trim().toLowerCase();
            if (contentChoice.equals("yes")) {
                offerContentWritingSuggestionsByAge(age);
            }
        } else if (age >= 11 && age <= 19) {
            System.out.println("\n--- Age Group: " + age + " (Guidance & Questions) ---");
            while (true) {
                System.out.println("\nWhat would you like to do?");
                System.out.println("1. Take a Career Quiz");
                System.out.println("2. Ask a general question");
                System.out.println("3. Get Content Writing Ideas");
                System.out.println("4. Go back to main menu");
                System.out.print("Enter your choice: ");
                String studentChoice = scanner.nextLine().trim();

                switch (studentChoice) {
                    case "1":
                        if (age <= 16) {
                            Quiz.askCareerQuiz(scanner);
                        } else {
                            Quiz.askAdvancedCareerQuiz(scanner);
                        }
                        break;
                    case "2":
                        System.out.print("What is your question? (e.g., 'how many subjects are in bangladesh'): ");
                        String question = scanner.nextLine().trim().toLowerCase();
                        Quiz.answerGeneralQuestion(question);
                        break;
                    case "3":
                        offerContentWritingSuggestionsByAge(age);
                        break;
                    case "4":
                        System.out.println("Returning to main menu.");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else if (age > 19) {
            System.out.println("\n--- Age Group: 19+ (Advanced Learning) ---");
            MentalHealth.support();
            System.out.println("Would you like some content writing ideas?");
            System.out.print("Enter 'yes' or 'no': ");
            String contentChoice = scanner.nextLine().trim().toLowerCase();
            if (contentChoice.equals("yes")) {
                offerContentWritingSuggestionsByAge(age);

            }
        } else {
            System.out.println("Age not supported. Please enter an age of 6 or above.");
        }
        System.out.println("--- End Student Portal ---");
    }

    static void handleTeacher() {
        System.out.println("\n--- Teacher Portal ---");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        Teacher currentTeacher = teachers.stream()
                .filter(t -> t.name.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);

        if (currentTeacher == null) {
            User currentUser = LoginSystem.getCurrentUser();
            if (currentUser != null && "teacher".equals(currentUser.getRole())) {
                System.out.print("Enter your subject expertise (e.g., Math, Science): ");
                String subject = scanner.nextLine().trim();
                if (subject.isEmpty()) subject = "General";

                currentTeacher = new Teacher(name, subject);
                teachers.add(currentTeacher);

                String sql = "INSERT OR IGNORE INTO teachers (name, subject) VALUES (?, ?)";
                try (Connection conn = DriverManager.getConnection(DB_URL);
                     PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, name);
                    pstmt.setString(2, subject);
                    pstmt.executeUpdate();
                    System.out.println("Teacher '" + name + "' registered successfully.");
                } catch (SQLException e) {
                    System.err.println("Database error registering teacher: " + e.getMessage());
                    teachers.remove(currentTeacher);
                    return;
                }
            } else {
                System.out.println("Please log in as a teacher to register.");
                return;
            }
        } else {
            System.out.println("Welcome back, " + currentTeacher.name + "!");
        }

        while (true) {
            System.out.println("\nTeacher Options for " + currentTeacher.name + ":");
            System.out.println("1. Add a Demo Video URL");
            System.out.println("2. Add My Schedule");
            System.out.println("3. View My Profile");
            System.out.println("4. Go back to main menu");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter demo video URL: ");
                    String url = scanner.nextLine().trim();
                    if (!url.isEmpty()) {
                        currentTeacher.addDemoVideo(url);
                        updateTeacherDetails(currentTeacher);
                        System.out.println("Demo video added.");
                    } else {
                        System.out.println("URL cannot be empty.");
                    }
                    break;
                case "2":
                    System.out.print("Enter schedule entry (e.g., 'Mon-Wed: 3 PM - 5 PM'): ");
                    String entry = scanner.nextLine().trim();
                    if (!entry.isEmpty()) {
                        currentTeacher.addScheduleEntry(entry);
                        updateTeacherDetails(currentTeacher);
                        System.out.println("Schedule added.");
                    } else {
                        System.out.println("Entry cannot be empty.");
                    }
                    break;
                case "3":
                    System.out.println("\n--- Your Profile ---");
                    System.out.println("Name: " + currentTeacher.name);
                    System.out.println("Subject: " + currentTeacher.subject);
                    System.out.println("Demo Videos: " + (currentTeacher.demoVideoURLs.isEmpty() ? "None" : ""));
                    currentTeacher.demoVideoURLs.forEach(v -> System.out.println("  - " + v));
                    System.out.println("Schedule: " + (currentTeacher.schedule.isEmpty() ? "Not set" : ""));
                    currentTeacher.schedule.forEach(s -> System.out.println("  - " + s));
                    System.out.println("------------------");
                    break;
                case "4":
                    System.out.println("Returning to main menu.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void updateTeacherDetails(Teacher teacher) {
        String videosStr = String.join(",", teacher.demoVideoURLs);
        String scheduleStr = String.join(",", teacher.schedule);
        String sql = """
            INSERT INTO teacher_details (teacher_name, demo_videos, schedule)
            VALUES (?, ?, ?)
            ON CONFLICT(teacher_name) DO UPDATE SET
                demo_videos = excluded.demo_videos,
                schedule = excluded.schedule;
            """;
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, teacher.name);
            pstmt.setString(2, videosStr);
            pstmt.setString(3, scheduleStr);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error updating teacher details: " + e.getMessage());
        }
    }

    static void handleAdmin() {
        System.out.println("\n--- Admin Panel ---");
        System.out.println("Total Users: " + users.size());
        System.out.println("Total Teachers: " + teachers.size());

        while (true) {
            System.out.println("\n--- Admin Options ---");
            System.out.println("1. View All Users");
            System.out.println("2. Delete User");
            System.out.println("3. View Teachers (Detailed)");
            System.out.println("4. Register New Admin");
            System.out.println("5. Go back to main menu");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("\n--- All Users ---");
                    if (users.isEmpty()) {
                        System.out.println("No users.");
                    } else {
                        users.values().forEach(u -> System.out.println("User: " + u.getUsername() + " | Role: " + u.getRole()));
                    }
                    break;
                case "2":
                    System.out.print("Enter username to delete: ");
                    String username = scanner.nextLine().trim();
                    if (users.get(username) == null) {
                        System.out.println("User not found.");
                    } else if ("admin".equalsIgnoreCase(users.get(username).getRole())) {
                        System.out.println("Cannot delete admin.");
                    } else {
                        try (Connection conn = DriverManager.getConnection(DB_URL)) {
                            conn.setAutoCommit(false);
                            try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE username = ?")) {
                                stmt.setString(1, username);
                                stmt.executeUpdate();
                            }
                            try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM teachers WHERE name = ?")) {
                                stmt.setString(1, username);
                                stmt.executeUpdate();
                            }
                            conn.commit();
                            users.remove(username);
                            teachers.removeIf(t -> t.name.equals(username));
                            System.out.println("User deleted.");
                        } catch (SQLException e) {
                            System.err.println("Delete failed: " + e.getMessage());
                        }
                    }
                    break;
                case "3":
                    System.out.println("\n--- Teachers ---");
                    teachers.forEach(t -> {
                        System.out.println("Name: " + t.name + " | Subject: " + t.subject);
                        System.out.println("  Videos: " + t.demoVideoURLs);
                        System.out.println("  Schedule: " + t.schedule);
                    });
                    break;
                case "4":
                    registerNewAdmin();
                    break;
                case "5":
                    System.out.println("Returning to main menu.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // --- Suggestion Method ---
    static void offerContentWritingSuggestionsByAge(int age) {
        System.out.println("\n--- Content Writing Ideas ---");
        String targetAgeGroup;
        if (age >= 6 && age <= 10) targetAgeGroup = "6-10";
        else if (age <= 19) targetAgeGroup = "11-19";
        else targetAgeGroup = "19+";

        List<ContentWritingSuggestion> suggestions = contentWritingSuggestions.stream()
                .filter(s -> s.getTargetAgeGroup().equals(targetAgeGroup))
                .collect(Collectors.toList());

        if (suggestions.isEmpty()) {
            System.out.println("No writing ideas for your age group yet.");
        } else {
            for (int i = 0; i < suggestions.size(); i++) {
                ContentWritingSuggestion s = suggestions.get(i);
                System.out.println((i + 1) + ". " + s.getTitle());
                System.out.println("   " + s.getDescription());
            }
        }
        System.out.println("-----------------------");
    }
}








class User {
    private final String username;
    private final String password;
    private final String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
}

class LoginSystem {
    private static User currentUser;

    public static boolean login(String username, String password) {
        User user = KairovaApp.users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    public static void logout() { currentUser = null; }
    public static User getCurrentUser() { return currentUser; }
}






class Teacher {
    String name;
    String subject;
    List<String> demoVideoURLs = new ArrayList<>();
    List<String> schedule = new ArrayList<>();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void addDemoVideo(String url) {
        if (url != null && !url.isEmpty()) demoVideoURLs.add(url);
    }

    public void addScheduleEntry(String entry) {
        if (entry != null && !entry.isEmpty()) schedule.add(entry);
    }
}





class ContentWritingSuggestion {
    int id;
    String title;
    String description;
    String targetAgeGroup;

    public ContentWritingSuggestion(int id, String title, String description, String targetAgeGroup) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.targetAgeGroup = targetAgeGroup;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getTargetAgeGroup() { return targetAgeGroup; }
}



