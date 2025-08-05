import java.util.*;

class Quiz {


    static void answerGeneralQuestion(String question) {
        System.out.println("\n--- Answer ---");
        // --- Answer: How many subjects are in Bangladesh ---
        if (question.contains("subjects") && question.contains("bangladesh")) {
            System.out.println("In Bangladesh, the number of subjects varies by level:");
            System.out.println("* *Primary (Classes 1-5):* Usually 6-8 core subjects (Bangla, English, Math, General Science, Social Science, Religion, Arts/Crafts, Physical Education).");
            System.out.println("* *Secondary (SSC/Classes 6-10):* Around 12-15 subjects including core and optional ones.");
            System.out.println("* *Higher Secondary (HSC/Classes 11-12):* Students typically choose a group (Science, Arts, Commerce) with 6-8 main subjects within that group.");
            System.out.println(); // Add a blank line for readability
            System.out.println("After completing HSC, students can pursue undergraduate degrees. Common options based on HSC group include:");
            System.out.println("* *Science Group:*");
            System.out.println("   - *Medicine:* MBBS (Bachelor of Medicine, Bachelor of Surgery) - Requires passing the medical college admission test.");
            System.out.println("   - *Engineering:* B.Sc. Eng. (e.g., CSE - Computer Science & Engineering, EEE - Electrical & Electronic Engineering, Civil, Mechanical, Chemical, Water Resources Engineering, Architecture, etc.) - Requires passing the engineering university admission test (e.g., BUET, DU, etc.).");
            System.out.println("   - *Agriculture:* B.Sc. in Agriculture (Agri-Biotechnology, Soil Science, Horticulture, etc.) - Offered by universities like BAU.");
            System.out.println("   - *Veterinary Science:* Doctor of Veterinary Medicine (DVM) - Offered by institutions like BAU.");
            System.out.println("   - *Physical Sciences & Mathematics:* B.Sc. (Hons) in Physics, Chemistry, Mathematics, Statistics.");
            System.out.println("   - *Life Sciences:* B.Sc. (Hons) in Botany, Zoology, Biochemistry, Genetics, Microbiology, Biotechnology.");
            System.out.println("   - *Pharmacy:* B.Pharm (Bachelor of Pharmacy) - Requires passing the pharmacy admission test.");
            System.out.println("   - *Data Science/Computer Science:* B.Sc. in CSE or related fields (often part of Engineering or Applied Sciences).");
            System.out.println("   - *Environmental Science:* B.Sc. in Environmental Science.");
            System.out.println("   - *Forestry:* B.Sc. in Forestry.");
            System.out.println("   - *Oceanography:* B.Sc. in Oceanography (e.g., at IOU).");
            System.out.println("   - *Nuclear Engineering:* Offered by institutions like IIC. (Note: Specific programs might vary).");
            System.out.println("* *Commerce Group:*");
            System.out.println("   - *Business Administration:* BBA (Bachelor of Business Administration).");
            System.out.println("   - *Accounting:* BBA (Accounting), B.Com (Bachelor of Commerce) with Accounting major.");
            System.out.println("   - *Management:* BBA (Management), MBA (often pursued after BBA/B.Com).");
            System.out.println("   - *Finance:* BBA (Finance), B.Com (Finance).");
            System.out.println("   - *Marketing:* BBA (Marketing).");
            System.out.println("   - *Banking & Insurance:* BBA (Banking), B.Com (Banking & Insurance).");
            System.out.println("   - *Economics:* B.A. (Hons) or B.Sc. (Hons) in Economics.");
            System.out.println("   - *Information Systems:* BBA in Management Information Systems (MIS).");
            System.out.println("* *Arts/Humanities Group:*");
            System.out.println("   - *Languages & Literature:* B.A. (Hons) in Bangla, English, Arabic, Pali, Sanskrit, Urdu, etc.");
            System.out.println("   - *Social Sciences:* B.A. (Hons) in History, Philosophy, Islamic History & Culture, Arabic, Fine Arts, Political Science, Sociology, Social Work, Anthropology, International Relations, Journalism & Media Studies.");
            System.out.println("   - *Law:* LLB (3-year program after a bachelor's, or 5-year integrated programs like BA LLB, BBA LLB).");
            System.out.println("   - *Islamic Studies:* B.A. (Hons) in Islamic Studies, Arabic (Islamic Studies).");
            System.out.println("   - *Performing Arts:* B.A. in Music, Dance, Drama/Theatre.");
            System.out.println("   - *Psychology:* B.A. (Hons) or B.Sc. (Hons) in Psychology.");
            System.out.println("   - *Liberal Arts:* Offered by some universities.");
            System.out.println("* *Vocational/Technical/Diploma (after SSC or HSC):*");
            System.out.println("   - *Diploma-in-Engineering:* 4-year diploma after SSC in fields like CSE, EEE, Civil, Mechanical, etc. Can lead to B.Sc. Engineering via lateral admission.");
            System.out.println("   - *Diploma in Pharmacy (D.Pharm):* 2-year program after HSC (Science).");
            System.out.println("   - *Diploma in Nursing:* Entry typically requires HSC (Science).");
            System.out.println("   - *Diploma in Textile Engineering:* Offered by specialized institutes.");
            System.out.println("   - *Diploma in Hotel Management/Catering Technology.*");
            System.out.println("   - *Diploma in Computer Application/IT.*");
            System.out.println("   - *Diploma in Fashion Design/Interior Design.*");
            System.out.println("   - *Diploma in Automobile Engineering/Refrigeration & Air Conditioning.*");
            System.out.println("   - *Diploma in Architecture (D.Arch):* Offered by some institutions.");
            System.out.println();
            System.out.println("Note: Specific course availability can vary between universities and colleges. Admission often requires passing specific entrance examinations for public universities or meeting criteria set by private institutions. Always check the official prospectus of the universities or colleges you are interested in.");
            // --- Answer: How many professions exist in Bangladesh ---
        }else if ((question.contains("how many") || question.contains("how much")) && question.contains("profession") && question.contains("bangladesh")) {
            System.out.println("It's impossible to give an exact number of professions in Bangladesh as new roles emerge constantly and definitions can vary.");
            System.out.println("However, here's a broad overview of major professional categories and examples:");
            System.out.println("* **Science & Technology:** Software Engineer, Data Scientist, Doctor, Engineer (Civil, Mechanical, Electrical, CSE, EEE), Pharmacist, Researcher, Biotechnologist, Astronomer.");
            System.out.println("* **Business & Finance:** Accountant, Business Manager, Marketing Specialist, Economist, Banker, Financial Analyst, Entrepreneur.");
            System.out.println("* **Arts & Humanities:** Teacher, Writer, Artist, Musician, Actor, Historian, Philosopher, Translator, Archaeologist.");
            System.out.println("* **Social Sciences & Law:** Lawyer, Judge, Social Worker, Psychologist, Politician, Diplomat, Public Policy Analyst, NGO Worker.");
            System.out.println("* **Media & Communication:** Journalist, Editor, Broadcaster, Public Relations Specialist, Content Creator, Filmmaker.");
            System.out.println("* **Healthcare & Medicine:** Doctor, Surgeon, Dentist, Nurse, Veterinarian, Physiotherapist, Nutritionist.");
            System.out.println("* **Education & Training:** School Teacher, College Lecturer, University Professor, Instructional Designer, Educational Administrator.");
            System.out.println("* **Agriculture & Environment:** Farmer, Agronomist, Veterinarian, Environmental Scientist, Forestry Officer.");
            System.out.println("* **Trades & Services:** Electrician, Plumber, Mechanic, Chef, Tailor, Barber, Driver, Tour Guide.");
            System.out.println("* **Government & Public Service:** Civil Servant, Police Officer, Army Officer, Customs Officer, Tax Collector.");
            System.out.println("* **Creative & Design:** Graphic Designer, Fashion Designer, Interior Designer, Architect, Animator, Game Developer.");
            System.out.println("* **Skilled Technical:** Technician, IT Support Specialist, Network Administrator, Cybersecurity Analyst.");
            System.out.println("This list is not exhaustive. Career quizzes in KAIROVA can help you explore specific paths within these broad areas.");
        }
        // --- Answer: What university has the best subject ---
        else if (question.contains("university") && (question.contains("best") || question.contains("good") || question.contains("top")) && (question.contains("subject") || question.contains("program") || question.contains("department"))) {
            System.out.println("The 'best' university for a subject depends on your specific interests, career goals, and the field you choose. Here are some generally recognized strengths:");
            System.out.println("* **Engineering & Technology:**");
            System.out.println("   - **BUET (Bangladesh University of Engineering and Technology):** Widely considered the top institution for most engineering disciplines.");
            System.out.println("   - **SUST (Shahjalal University of Science and Technology):** Strong in CSE, EEE, and other sciences.");
            System.out.println("   - **CUET (Chittagong University of Engineering & Technology), RUET (Rajshahi University of Engineering & Technology), KUET (Khulna University of Engineering & Technology):** Excellent regional options.");
            System.out.println("* **Medicine:**");
            System.out.println("   - **Dhaka Medical College (DMC), BSMMU (Bangabandhu Sheikh Mujib Medical University):** Top public medical institutions.");
            System.out.println("   - **Popular Medical College, Square Hospital Medical College:** Well-regarded private options.");
            System.out.println("* **Business & Commerce:**");
            System.out.println("   - **IBA (Institute of Business Administration, DU):** Highly prestigious for BBA/MBA.");
            System.out.println("   - **NSU (North South University) - School of Business:** Strong programs.");
            System.out.println("   - **BRAC University - School of Business:** Well-regarded.");
            System.out.println("* **Science (General):**");
            System.out.println("   - **DU (University of Dhaka) - Science Faculty:** Historic strength in Physics, Chemistry, Mathematics, Botany, Zoology.");
            System.out.println("   - **JU (Jahangirnagar University) - Science Faculty:** Strong in various science disciplines.");
            System.out.println("* **Arts & Humanities:**");
            System.out.println("   - **DU (University of Dhaka) - Arts Faculty:** Leading in English, History, Philosophy, Fine Arts, Bengali, IR.");
            System.out.println("   - **JU (Jahangirnagar University) - Arts Faculty:** Excellent across arts and humanities.");
            System.out.println("* **Social Sciences & Law:**");
            System.out.println("   - **DU (University of Dhaka) - Social Sciences & Law Faculties:** Strong departments.");
            System.out.println("   - **BRAC University - Social Sciences & Law:** Modern, well-regarded programs.");
            System.out.println("Research the specific departments and faculty within these universities for the subject you're interested in. Career quizzes can also guide you towards relevant fields.");
        }
        else if (question.contains("quiz") || question.contains("career")) {
            System.out.println("You can take quizzes in the Student Portal based on your age group to explore interests and potential careers.");
        } else if (question.contains("teacher") || question.contains("demo")) {
            System.out.println("Teachers can add demo video URLs in the Teacher Portal. Check the teacher list in the Admin Panel or Teacher Portal profile.");
        } else if (question.contains("journal") || question.contains("mental")) {
            System.out.println("Students aged 19+ can add journal entries in the Student Portal. Journals help with self-reflection and mental well-being.");
        } else {
            System.out.println("I don't have a specific answer for that question yet. Try asking about subjects in Bangladesh, quizzes, teachers, or journals.");
        }
        System.out.println("--------------");
    }

    static void askBasicQuiz(Scanner sc) {
        System.out.println("Let's play a challenging quiz for kids aged 6-10!");
        int score = 0;
        int totalQuestions = 0;
        totalQuestions++;
        System.out.println();
        System.out.println("Question 1: I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        System.out.println("1. A ghost");
        System.out.println("2. An echo");
        System.out.println("3. A shadow");
        System.out.println("4. A cloud");
        System.out.print("Your answer (1-4): ");
        String answer1 = sc.nextLine().trim();
        if (answer1.equals("2")) {
            System.out.println("Correct! An echo speaks by repeating sounds without a mouth! 🎉");
            score++;
        } else {
            System.out.println("Not quite! The answer is an echo. It repeats what you say without a mouth. 🗣");
        }
        totalQuestions++;
        System.out.println();
        System.out.println("Question 2: If you have 3 apples and give 2 to your friend, but then your friend gives you 1 orange, how many fruits do you have now?");
        System.out.println("1. 1");
        System.out.println("2. 2");
        System.out.println("3. 3");
        System.out.println("4. 4");
        System.out.print("Your answer (1-4): ");
        String answer2 = sc.nextLine().trim();
        if (answer2.equals("2")) {
            System.out.println("Correct! You have 1 apple and 1 orange, so 2 fruits! 🍎🍊");
            score++;
        } else {
            System.out.println("Not quite! You gave away 2 apples, leaving 1 apple, and got 1 orange, so you have 2 fruits. 🍎🍊");
        }
        totalQuestions++;
        System.out.println();
        System.out.println("Question 3: Which of these animals can live both on land and in water?");
        System.out.println("1. Crocodile");
        System.out.println("2. Elephant");
        System.out.println("3. Eagle");
        System.out.println("4. Kangaroo");
        System.out.print("Your answer (1-4): ");
        String answer3 = sc.nextLine().trim();
        if (answer3.equals("1")) {
            System.out.println("Correct! Crocodiles can live on land and in water! 🐊");
            score++;
        } else {
            System.out.println("Not quite! Crocodiles are amphibians that live both on land and in water. 🐊");
        }
        totalQuestions++;
        System.out.println();
        System.out.println("Question 4: If you could invent a new toy, what would it do?");
        System.out.println("1. Fly in the sky");
        System.out.println("2. Talk to animals");
        System.out.println("3. Change colors every minute");
        System.out.println("4. Make food");
        System.out.print("Your answer (1-4): ");
        String answer4 = sc.nextLine().trim();
        System.out.println("That's a super cool idea for a toy! Keep being creative! ✨");
        totalQuestions++;
        System.out.println();
        System.out.println("Question 5: If a square has 4 sides of equal length and you double the length of each side, how many sides does the new square have?");
        System.out.println("1. 2");
        System.out.println("2. 4");
        System.out.println("3. 6");
        System.out.println("4. 8");
        System.out.print("Your answer (1-4): ");
        String answer5 = sc.nextLine().trim();
        if (answer5.equals("2")) {
            System.out.println("Correct! A square always has 4 sides, even if you change the length! 🔲");
            score++;
        } else {
            System.out.println("Tricky one! A square always has 4 sides, no matter how long they are. 🔲");
        }
        System.out.println();
        System.out.println("--- Quiz Results ---");
        System.out.println("You got " + score + " out of " + totalQuestions + " questions correct!");
        if (score == totalQuestions) {
            System.out.println("Amazing! You're a super smart quiz master! 🌟");
        } else if (score >= totalQuestions / 2) {
            System.out.println("Great job! You tackled some tricky questions! Keep learning! 😊");
        } else {
            System.out.println("Nice try! Those were tough questions, and you're getting smarter with each one! 🌱");
        }
        System.out.println("--------------------");
    }

    static void askCareerQuiz(Scanner sc) {
        System.out.println("Let's explore your passions and interests to find suitable career paths!");
        System.out.println();
        System.out.println("Question 1: What kind of challenges excite you the most?");
        System.out.println("1. Figuring out how complex systems work or fixing technical issues.");
        System.out.println("2. Understanding people's emotions and helping them overcome difficulties.");
        System.out.println("3. Creating something new from scratch, like art, designs, or physical objects.");
        System.out.println("4. Analyzing information, conducting research, and discovering new facts.");
        System.out.print("Enter your choice (1-4): ");
        String choice1 = sc.nextLine().trim();
        System.out.println();
        System.out.println("Question 2: Which school subjects naturally capture your attention?");
        System.out.println("1. Math, Computer Science, and Physics (logic and calculations).");
        System.out.println("2. Biology, Chemistry, and Social Studies (understanding living things and society).");
        System.out.println("3. Art, Design & Technology, and Music (creativity and hands-on making).");
        System.out.println("4. English Literature, History, and Philosophy (reading, writing, and critical thinking).");
        System.out.print("Enter your choice (1-4): ");
        String choice2 = sc.nextLine().trim();
        System.out.println();
        System.out.println("Question 3: How do you prefer to spend your free time?");
        System.out.println("1. Building things, coding, playing strategic games, or experimenting with tech.");
        System.out.println("2. Volunteering, taking care of pets, talking to friends, or learning about health.");
        System.out.println("3. Drawing, crafting, photography, writing stories/music, or exploring new places.");
        System.out.println("4. Reading non-fiction, watching documentaries, debating, or journaling.");
        System.out.print("Enter your choice (1-4): ");
        String choice3 = sc.nextLine().trim();
        System.out.println();
        System.out.println("Question 4: What kind of impact do you aspire to make in the world?");
        System.out.println("1. Innovate and create new technologies or solutions that change how things work.");
        System.out.println("2. Directly help individuals or communities improve their well-being and solve social problems.");
        System.out.println("3. Bring beauty, joy, or new perspectives through creative expression or design.");
        System.out.println("4. Uncover truths, share knowledge, and contribute to a deeper understanding of the world.");
        System.out.print("Enter your choice (1-4): ");
        String choice4 = sc.nextLine().trim();
        System.out.println();
        System.out.println("Question 5: What kind of work environment sounds most appealing to you?");
        System.out.println("1. A structured setting, working with data or technology, often independently or in small focused teams.");
        System.out.println("2. A dynamic environment, interacting with many different people, providing service or care.");
        System.out.println("3. A studio, workshop, or outdoors, where you can physically create, design, or build.");
        System.out.println("4. A library, lab, or office, where you can conduct research, analyze, and communicate findings.");
        System.out.print("Enter your choice (1-4): ");
        String choice5 = sc.nextLine().trim();
        int analyticalTech = 0;
        int helpingSocial = 0;
        int creativeHandsOn = 0;
        int researchCommunication = 0;
        if ("1".equals(choice1)) analyticalTech++; else if ("2".equals(choice1)) helpingSocial++; else if ("3".equals(choice1)) creativeHandsOn++; else if ("4".equals(choice1)) researchCommunication++;
        if ("1".equals(choice2)) analyticalTech++; else if ("2".equals(choice2)) helpingSocial++; else if ("3".equals(choice2)) creativeHandsOn++; else if ("4".equals(choice2)) researchCommunication++;
        if ("1".equals(choice3)) analyticalTech++; else if ("2".equals(choice3)) helpingSocial++; else if ("3".equals(choice3)) creativeHandsOn++; else if ("4".equals(choice3)) researchCommunication++;
        if ("1".equals(choice4)) analyticalTech++; else if ("2".equals(choice4)) helpingSocial++; else if ("3".equals(choice4)) creativeHandsOn++; else if ("4".equals(choice4)) researchCommunication++;
        if ("1".equals(choice5)) analyticalTech++; else if ("2".equals(choice5)) helpingSocial++; else if ("3".equals(choice5)) creativeHandsOn++; else if ("4".equals(choice5)) researchCommunication++;
        Map<String, Integer> scores = new HashMap<>();
        scores.put("analyticalTech", analyticalTech);
        scores.put("helpingSocial", helpingSocial);
        scores.put("creativeHandsOn", creativeHandsOn);
        scores.put("researchCommunication", researchCommunication);
        suggestCareer(scores, sc);
    }

    static void askAdvancedCareerQuiz(Scanner sc) {
        System.out.println("Choose your interests:");
        System.out.println("1. Science");
        System.out.println("2. Arts");
        System.out.println("3. Commerce");
        System.out.println("4. Social Work");
        System.out.print("Enter your choice (1-4): ");
        String choice = sc.nextLine().trim();
        suggestUniversity(choice); // Show universities immediately after interest choice
        System.out.println();
        System.out.println("Based on your interest, here are some example careers:");
        List<String> professions = new ArrayList<>();
        switch (choice) {
            case "1":
                System.out.println("- Software Engineer, Data Scientist, Doctor, Biomedical Engineer");
                professions.addAll(Arrays.asList("Software Engineer", "Data Scientist", "Doctor", "Biomedical Engineer"));
                break;
            case "2":
                System.out.println("- Graphic Designer, Artist, Animator, Filmmaker");
                professions.addAll(Arrays.asList("Graphic Designer", "Artist", "Animator", "Filmmaker"));
                break;
            case "3":
                System.out.println("- Accountant, Marketing Specialist, Economist, Business Manager");
                professions.addAll(Arrays.asList("Accountant", "Marketing Specialist", "Economist", "Business Manager"));
                break;
            case "4":
                System.out.println("- Social Worker, Counselor, Public Policy Analyst, NGO Program Manager");
                professions.addAll(Arrays.asList("Social Worker", "Counselor", "Public Policy Analyst", "NGO Program Manager"));
                break;
            default:
                System.out.println("No specific careers listed. Please select a profession manually.");
                professions.add("General");
                break;
        }
        System.out.println();
        System.out.println("Which career are you interested in?");
        for (int i = 0; i < professions.size(); i++) {
            System.out.println((i + 1) + ". " + professions.get(i));
        }
        System.out.print("Enter the number of your choice (or 0 to skip): ");
        String professionChoice = sc.nextLine().trim();
        int choiceIndex;
        try {
            choiceIndex = Integer.parseInt(professionChoice) - 1;
        } catch (NumberFormatException e) {
            choiceIndex = -1;
        }
        if (choiceIndex >= 0 && choiceIndex < professions.size()) {
            String selectedProfession = professions.get(choiceIndex);
            System.out.print("Would you like a step-by-step guideline to become a " + selectedProfession + "? (yes/no): ");
            String guidelineChoice = sc.nextLine().trim().toLowerCase();
            if (guidelineChoice.equals("yes")) {
                provideCareerGuideline(selectedProfession);
            } else {
                System.out.println("Okay, keep exploring your career options!");
            }
        } else {
            System.out.println("Invalid or no career selected. Keep exploring your interests!");
        }
    }

    static void suggestCareer(Map<String, Integer> scores, Scanner sc) {
        System.out.println("Based on your passions and interests, here are some suggested career paths:");
        int maxScore = 0;
        for (int score : scores.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        List<String> topAptitudes = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() == maxScore) {
                topAptitudes.add(entry.getKey());
            }
        }
        List<String> professions = new ArrayList<>();
        if (topAptitudes.isEmpty()) {
            System.out.println("We couldn't determine a strong primary interest. Keep exploring!");
            System.out.println("Some general career fields: Technology, Healthcare, Arts, Education, Business.");
            System.out.println("Explore unique professions in Bangladesh like: Agricultural Scientist, Textile Designer, Tourism Specialist.");
            professions.addAll(Arrays.asList("Agricultural Scientist", "Textile Designer", "Tourism Specialist"));
        } else if (topAptitudes.size() > 1) {
            System.out.println("You have diverse interests! Consider careers that combine these areas.");
            if (topAptitudes.contains("analyticalTech") && topAptitudes.contains("creativeHandsOn")) {
                System.out.println("- Software Engineer with UI/UX focus, Game Developer, Industrial Designer, Architect, Robotics Engineer, Multimedia Specialist.");
                professions.addAll(Arrays.asList("Software Engineer with UI/UX focus", "Game Developer", "Industrial Designer", "Architect", "Robotics Engineer", "Multimedia Specialist"));
            }
            if (topAptitudes.contains("analyticalTech") && topAptitudes.contains("helpingSocial")) {
                System.out.println("- Health Informatics Specialist, Biomedical Engineer, Medical Technologist, Public Health Researcher, Data Scientist in Social Sector.");
                professions.addAll(Arrays.asList("Health Informatics Specialist", "Biomedical Engineer", "Medical Technologist", "Public Health Researcher", "Data Scientist in Social Sector"));
            }
            if (topAptitudes.contains("helpingSocial") && topAptitudes.contains("researchCommunication")) {
                System.out.println("- Social Scientist, Journalist (Investigative/Human Rights), Public Policy Analyst, NGO Program Manager, Counselor/Therapist.");
                professions.addAll(Arrays.asList("Social Scientist", "Journalist (Investigative/Human Rights)", "Public Policy Analyst", "NGO Program Manager", "Counselor/Therapist"));
            }
            if (topAptitudes.contains("creativeHandsOn") && topAptitudes.contains("researchCommunication")) {
                System.out.println("- Technical Writer, Museum Curator, Documentary Filmmaker, Content Creator, Architectural Historian.");
                professions.addAll(Arrays.asList("Technical Writer", "Museum Curator", "Documentary Filmmaker", "Content Creator", "Architectural Historian"));
            }
            System.out.println("- Consider interdisciplinary fields or roles that allow for varied tasks.");
        } else {
            String primaryAptitude = topAptitudes.get(0);
            switch (primaryAptitude) {
                case "analyticalTech":
                    System.out.println("- Software Engineer, Data Scientist, AI/Machine Learning Engineer, Network Administrator, Cybersecurity Specialist, Electrical Engineer, Civil Engineer, Web Designer.");
                    System.out.println("   * Local Relevance: IT sector in Bangladesh is booming, with strong demand for software and network professionals.");
                    professions.addAll(Arrays.asList("Software Engineer", "Data Scientist", "AI/Machine Learning Engineer", "Network Administrator", "Cybersecurity Specialist", "Electrical Engineer", "Civil Engineer", "Web Designer"));
                    break;
                case "helpingSocial":
                    System.out.println("- Doctor, Nurse, Pharmacist, Psychologist, Counselor, Social Worker, Teacher, Human Resources Manager, Environmental Scientist, Nutritionist.");
                    System.out.println("   * Local Relevance: Healthcare and education are ever-growing sectors. NGOs and social development initiatives are also significant.");
                    professions.addAll(Arrays.asList("Doctor", "Nurse", "Pharmacist", "Psychologist", "Counselor", "Social Worker", "Teacher", "Human Resources Manager", "Environmental Scientist", "Nutritionist"));
                    break;
                case "creativeHandsOn":
                    System.out.println("- Graphic Designer, Artist, Architect, Fashion Designer, Animator, Photographer, Interior Designer, Chef/Culinary Artist, Craftsman/Artisan, Filmmaker.");
                    System.out.println("   * Local Relevance: Emerging creative industries, demand in advertising, media, and design sectors. Traditional crafts also offer opportunities.");
                    professions.addAll(Arrays.asList("Graphic Designer", "Artist", "Architect", "Fashion Designer", "Animator", "Photographer", "Interior Designer", "Chef/Culinary Artist", "Craftsman/Artisan", "Filmmaker"));
                    break;
                case "researchCommunication":
                    System.out.println("- Writer, Journalist, Editor, Researcher, University Lecturer, Lawyer, Economist, Marketing Specialist, Public Relations Manager, Policy Analyst.");
                    System.out.println("   * Local Relevance: Strong demand in media, academia, legal services, and various corporate communication roles.");
                    professions.addAll(Arrays.asList("Writer", "Journalist", "Editor", "Researcher", "University Lecturer", "Lawyer", "Economist", "Marketing Specialist", "Public Relations Manager", "Policy Analyst"));
                    break;
            }
        }
        System.out.println();
        System.out.println("Remember, these are just starting points. The most important thing is to explore, learn, and follow what truly excites you!");
        System.out.println("Talk to professionals in fields that interest you, read books, and try out relevant activities.");
        System.out.println();
        if (!professions.isEmpty()) {
            System.out.println("Which career are you interested in?");
            for (int i = 0; i < professions.size(); i++) {
                System.out.println((i + 1) + ". " + professions.get(i));
            }
            System.out.print("Enter the number of your choice (or 0 to skip): ");
            String professionChoice = sc.nextLine().trim();
            int choiceIndex;
            try {
                choiceIndex = Integer.parseInt(professionChoice) - 1;
            } catch (NumberFormatException e) {
                choiceIndex = -1;
            }
            if (choiceIndex >= 0 && choiceIndex < professions.size()) {
                String selectedProfession = professions.get(choiceIndex);
                System.out.print("Would you like a step-by-step guideline to become a " + selectedProfession + "? (yes/no): ");
                String guidelineChoice = sc.nextLine().trim().toLowerCase();
                if (guidelineChoice.equals("yes")) {
                    provideCareerGuideline(selectedProfession);
                } else {
                    System.out.println("Okay, keep exploring your career options!");
                }
            } else {
                System.out.println("Invalid or no career selected. Keep exploring your interests!");
            }
        }
    }

    static void suggestUniversity(String choice) { // This method now shows output directly
        System.out.print("\nSuggested University Paths: ");
        switch (choice) {
            case "1":
                System.out.println("For Science & Engineering: BUET (Bangladesh University of Engineering and Technology), SUST (Shahjalal University of Science and Technology), CUET (Chittagong University of Engineering & Technology), RUET (Rajshahi University of Engineering & Technology), KUET (Khulna University of Engineering & Technology), DU (University of Dhaka) - Science Faculty, JU (Jahangirnagar University) - Science Faculty, NSU (North South University) - Engineering Programs, BRAC University - Engineering Programs.");
                break;
            case "2":
                System.out.println("For Arts & Humanities: DU (University of Dhaka) - English, History, Philosophy, Fine Arts, Bengali, International Relations faculties; JU (Jahangirnagar University) - Arts faculties; RU (University of Rajshahi) - Arts faculties; CU (University of Chittagong) - Arts faculties.");
                break;
            case "3":
                System.out.println("For Commerce & Business Studies: IBA (Institute of Business Administration, DU), BUP (Bangladesh University of Professionals) - Business Faculty, NSU (North South University) - Business Programs, BRAC University - Business Programs, DU (University of Dhaka) - Business Studies Faculty, CU (University of Chittagong) - Business Administration.");
                break;
            case "4":
                System.out.println("For Social Sciences & Law: DU (University of Dhaka) - Social Sciences, Law faculties; BUP (Bangladesh University of Professionals) - Disaster Management, Law; JU (Jahangirnagar University) - Social Sciences; BRAC University - Public Health, Law, Social Sciences.");
                break;
            default:
                System.out.println("Research more about your favorite subject and universities in Bangladesh! Consider both public and private options.");
        }
        System.out.println(); // Add a blank line for readability
    }

    static void provideCareerGuideline(String profession) {
        System.out.println();
        System.out.println("--- Step-by-Step Guideline to Become a " + profession + " ---");
        switch (profession) {
            case "Software Engineer":
            case "Software Engineer with UI/UX focus":
                System.out.println("1. Build a Strong Foundation in School: Focus on Math, Physics, and ICT in your secondary education. Join computer clubs or coding competitions in school.");
                System.out.println("2. Learn Programming Basics: Start with beginner-friendly languages like Scratch or Python. Use platforms like Code.org or 10 Minute School (Bangladesh) for free tutorials.");
                System.out.println("3. Pursue Higher Education: Enroll in a Computer Science or Software Engineering program at universities like BUET, DU, or NSU. Aim for a bachelor’s degree.");
                System.out.println("4. Develop Practical Skills: Practice coding on platforms like LeetCode, HackerRank, or URI Online Judge. Build small projects like apps or websites.");
                System.out.println("5. Gain Experience: Participate in internships or freelance projects through platforms like Upwork or local IT firms in Bangladesh (e.g., Grameenphone IT, Brain Station 23).");
                System.out.println("6. Stay Updated: Follow tech trends (e.g., AI, cloud computing) and learn tools like Git, Docker, or frameworks like React (for UI/UX focus).");
                System.out.println("7. Network and Certify: Attend tech meetups in Dhaka or online webinars. Consider certifications like Oracle Java or AWS to boost your resume.");
                break;
            case "Data Scientist":
                System.out.println("1. Excel in Math and Statistics: Strengthen your skills in Math and Statistics during school. Join math clubs or Olympiads.");
                System.out.println("2. Learn Programming: Start with Python or R for data analysis. Use free resources like Khan Academy or Coursera.");
                System.out.println("3. Pursue Higher Education: Study Computer Science, Statistics, or Data Science at universities like BUET, DU, or BRAC University.");
                System.out.println("4. Master Data Tools: Learn tools like Pandas, NumPy, and Tableau. Practice on Kaggle with datasets relevant to Bangladesh (e.g., agriculture, health).");
                System.out.println("5. Gain Experience: Work on internships or projects with local companies like bKash or government data initiatives.");
                System.out.println("6. Build a Portfolio: Create a portfolio of data projects (e.g., market analysis, public health trends) to showcase to employers.");
                System.out.println("7. Network and Certify: Join data science communities in Bangladesh and consider certifications like Google Data Analytics or Microsoft Azure AI.");
                break;
            case "AI/Machine Learning Engineer":
                System.out.println("1. Focus on Math and ICT: Excel in Math, Physics, and ICT in school. Participate in coding or robotics clubs.");
                System.out.println("2. Learn Programming: Master Python and libraries like TensorFlow or PyTorch. Start with free courses on edX or Udemy.");
                System.out.println("3. Pursue Higher Education: Enroll in Computer Science or AI programs at BUET, SUST, or NSU.");
                System.out.println("4. Work on AI Projects: Experiment with machine learning models on platforms like Kaggle or Google Colab.");
                System.out.println("5. Gain Experience: Seek internships at AI-focused companies in Bangladesh (e.g., DataSoft, Augmedix) or research labs.");
                System.out.println("6. Stay Current: Follow AI research and trends through arXiv or local tech conferences.");
                System.out.println("7. Certifications and Networking: Obtain certifications like Google TensorFlow Developer and network at AI events in Dhaka.");
                break;
            case "Network Administrator":
                System.out.println("1. Learn ICT Basics: Focus on ICT in school and explore networking concepts like IP addresses and routers.");
                System.out.println("2. Study Networking Fundamentals: Use free resources like Cisco Networking Academy to learn about networks.");
                System.out.println("3. Pursue Higher Education: Study Computer Science or IT at universities like BUET, DU, or AUST.");
                System.out.println("4. Gain Practical Skills: Practice setting up networks using tools like Packet Tracer. Join school IT clubs.");
                System.out.println("5. Seek Internships: Intern at telecom companies like Grameenphone or Robi Axiata in Bangladesh.");
                System.out.println("6. Earn Certifications: Obtain Cisco CCNA or CompTIA Network+ certifications to enhance your skills.");
                System.out.println("7. Network Professionally: Attend IT meetups in Bangladesh and connect with professionals on LinkedIn.");
                break;
            case "Cybersecurity Specialist":
                System.out.println("1. Master ICT and Math: Focus on ICT and logical problem-solving in school. Join cybersecurity workshops if available.");
                System.out.println("2. Learn Cybersecurity Basics: Explore ethical hacking using resources like TryHackMe or Hack The Box.");
                System.out.println("3. Pursue Higher Education: Study Computer Science or Cybersecurity at BUET, NSU, or BRAC University.");
                System.out.println("4. Practice Security Skills: Experiment with tools like Wireshark or Kali Linux in a safe environment.");
                System.out.println("5. Gain Experience: Intern at cybersecurity firms or IT departments in Bangladesh (e.g., bKash, Augmedix).");
                System.out.println("6. Earn Certifications: Pursue CompTIA Security+ or Certified Ethical Hacker (CEH) certifications.");
                System.out.println("7. Join Cybersecurity Communities: Participate in local cybersecurity events or online forums like Reddit’s r/netsec.");
                break;
            case "Electrical Engineer":
                System.out.println("1. Excel in Science: Focus on Physics and Math in school. Join science fairs or electronics clubs.");
                System.out.println("2. Learn Electronics Basics: Experiment with circuits using kits or online simulators like Tinkercad.");
                System.out.println("3. Pursue Higher Education: Study Electrical Engineering at BUET, CUET, RUET, or KUET.");
                System.out.println("4. Gain Practical Skills: Work on projects like building simple circuits or renewable energy models.");
                System.out.println("5. Seek Internships: Intern at companies like Bangladesh Power Development Board or Siemens Bangladesh.");
                System.out.println("6. Stay Updated: Follow advancements in renewable energy and smart grids relevant to Bangladesh.");
                System.out.println("7. Certifications and Networking: Obtain certifications like IEEE and attend engineering conferences.");
                break;
            case "Civil Engineer":
                System.out.println("1. Focus on Math and Physics: Excel in these subjects in school. Join science or math Olympiads.");
                System.out.println("2. Explore Engineering Concepts: Learn about structures and materials through online resources or school projects.");
                System.out.println("3. Pursue Higher Education: Study Civil Engineering at BUET, CUET, RUET, or DU.");
                System.out.println("4. Gain Practical Experience: Work on projects like model bridges or urban planning simulations.");
                System.out.println("5. Seek Internships: Intern at construction firms like Mir Akhter Hossain or government projects in Bangladesh.");
                System.out.println("6. Learn Industry Tools: Master software like AutoCAD or STAAD.Pro for design and analysis.");
                System.out.println("7. Network and Certify: Join the Institution of Engineers, Bangladesh, and pursue certifications like PMP.");
                break;
            case "Web Designer":
                System.out.println("1. Develop ICT Skills: Focus on ICT in school and explore web design basics like HTML and CSS.");
                System.out.println("2. Learn Web Development: Use free platforms like W3Schools or freeCodeCamp to learn HTML, CSS, and JavaScript.");
                System.out.println("3. Pursue Higher Education: Study Computer Science or IT at NSU, BRAC, or AUST (optional for web design).");
                System.out.println("4. Build a Portfolio: Create sample websites for school clubs or local businesses.");
                System.out.println("5. Gain Experience: Freelance on platforms like Upwork or intern at local agencies like Creative IT Institute.");
                System.out.println("6. Master Design Tools: Learn Adobe XD, Figma, or WordPress for professional web design.");
                System.out.println("7. Network Locally: Attend tech meetups in Dhaka and showcase your portfolio on Behance or Dribbble.");
                break;
            case "Doctor":
                System.out.println("1. Excel in Science: Focus on Biology, Chemistry, and Physics in school. Join science clubs or Olympiads.");
                System.out.println("2. Prepare for Medical Entrance: Study for medical college admission tests in Bangladesh (e.g., MBBS entrance exam).");
                System.out.println("3. Pursue Higher Education: Enroll in an MBBS program at Dhaka Medical College, BSMMU, or other medical colleges.");
                System.out.println("4. Gain Practical Experience: Volunteer at local clinics or hospitals to understand healthcare settings.");
                System.out.println("5. Complete Internship: Finish the mandatory internship after MBBS to gain hands-on experience.");
                System.out.println("6. Specialize: Pursue postgraduate studies (e.g., FCPS, MD) in a specialty like cardiology or pediatrics.");
                System.out.println("7. Join Professional Bodies: Register with the Bangladesh Medical and Dental Council (BMDC) and network with doctors.");
                break;
            case "Nurse":
                System.out.println("1. Focus on Science: Excel in Biology and Chemistry in school. Join health-related school activities.");
                System.out.println("2. Learn Basic Healthcare: Take first aid courses or volunteer at community health camps.");
                System.out.println("3. Pursue Nursing Education: Enroll in a Diploma in Nursing or BSc in Nursing at colleges like Dhaka Nursing College.");
                System.out.println("4. Gain Clinical Experience: Participate in clinical training during your nursing program.");
                System.out.println("5. Seek Employment: Apply for jobs at hospitals like Apollo or Square Hospital in Bangladesh.");
                System.out.println("6. Continue Learning: Pursue advanced certifications like Critical Care Nursing or Midwifery.");
                System.out.println("7. Join Associations: Become a member of the Bangladesh Nurses Association for networking and support.");
                break;
            case "Pharmacist":
                System.out.println("1. Master Science Subjects: Focus on Chemistry and Biology in school. Join science fairs.");
                System.out.println("2. Learn About Medicines: Explore basic pharmacology through online resources or school projects.");
                System.out.println("3. Pursue Higher Education: Study Pharmacy at DU, JU, or private universities like NSU.");
                System.out.println("4. Gain Practical Experience: Intern at pharmacies like Lazz Pharma or pharmaceutical companies like Beximco.");
                System.out.println("5. Obtain Licensing: Register with the Pharmacy Council of Bangladesh to practice legally.");
                System.out.println("6. Stay Updated: Follow advancements in pharmaceuticals through journals or local seminars.");
                System.out.println("7. Network: Join the Bangladesh Pharmaceutical Society for professional connections.");
                break;
            case "Psychologist":
                System.out.println("1. Study Social Sciences: Focus on Psychology or Social Studies in school if available.");
                System.out.println("2. Learn About Mental Health: Read books or take online courses on psychology (e.g., Coursera).");
                System.out.println("3. Pursue Higher Education: Study Psychology at DU, JU, or BRAC University.");
                System.out.println("4. Gain Experience: Volunteer at mental health NGOs or clinics like Moner Bondhu in Bangladesh.");
                System.out.println("5. Specialize: Pursue a master’s in Clinical Psychology or Counseling Psychology.");
                System.out.println("6. Obtain Certification: Get certified by the Bangladesh Clinical Psychology Society.");
                System.out.println("7. Network: Attend mental health workshops and connect with professionals in Dhaka.");
                break;
            case "Counselor":
            case "Counselor/Therapist":
                System.out.println("1. Develop Communication Skills: Participate in school debates or counseling clubs.");
                System.out.println("2. Learn Counseling Basics: Take online courses on counseling skills (e.g., Udemy).");
                System.out.println("3. Pursue Higher Education: Study Psychology or Counseling at DU, JU, or BRAC University.");
                System.out.println("4. Gain Experience: Volunteer at schools or NGOs offering counseling services.");
                System.out.println("5. Specialize: Pursue certifications in school counseling or career counseling.");
                System.out.println("6. Build a Network: Join the Bangladesh Psychological Association for connections.");
                System.out.println("7. Practice Locally: Offer counseling at schools or community centers in Bangladesh.");
                break;
            case "Social Worker":
                System.out.println("1. Engage in Community Activities: Join school clubs focused on social service or volunteering.");
                System.out.println("2. Learn About Social Issues: Read about local issues like poverty or education in Bangladesh.");
                System.out.println("3. Pursue Higher Education: Study Social Work at DU, JU, or BRAC University.");
                System.out.println("4. Gain Experience: Volunteer with NGOs like BRAC or Grameen Bank.");
                System.out.println("5. Develop Skills: Learn project management and community organizing skills.");
                System.out.println("6. Seek Employment: Apply to NGOs or government social welfare programs.");
                System.out.println("7. Network: Join the Bangladesh Council for Social Work for professional growth.");
                break;
            case "Teacher":
                System.out.println("1. Excel in Your Favorite Subject: Focus on a subject you love (e.g., Math, English) in school.");
                System.out.println("2. Develop Teaching Skills: Practice explaining concepts to classmates or younger students.");
                System.out.println("3. Pursue Higher Education: Study Education or your subject at DU, JU, or National University.");
                System.out.println("4. Gain Experience: Volunteer as a tutor or assist teachers at your school.");
                System.out.println("5. Obtain Certification: Complete a B.Ed. or M.Ed. for teaching credentials.");
                System.out.println("6. Apply for Jobs: Seek teaching positions at schools like Scholastica or government institutions.");
                System.out.println("7. Join Associations: Become a member of the Bangladesh Teachers’ Association.");
                break;
            case "Human Resources Manager":
                System.out.println("1. Develop People Skills: Participate in school clubs or leadership roles to build communication skills.");
                System.out.println("2. Learn HR Basics: Take online courses on HR fundamentals (e.g., Coursera).");
                System.out.println("3. Pursue Higher Education: Study HRM or Business Administration at IBA (DU), NSU, or BRAC.");
                System.out.println("4. Gain Experience: Intern at HR departments in companies like Unilever Bangladesh.");
                System.out.println("5. Learn HR Tools: Familiarize yourself with tools like BambooHR or payroll systems.");
                System.out.println("6. Earn Certifications: Pursue certifications like SHRM-CP or PHR.");
                System.out.println("7. Network: Join HR associations in Bangladesh and attend industry events.");
                break;
            case "Environmental Scientist":
                System.out.println("1. Focus on Science: Excel in Biology, Chemistry, and Geography in school.");
                System.out.println("2. Learn About the Environment: Participate in environmental clubs or clean-up drives.");
                System.out.println("3. Pursue Higher Education: Study Environmental Science at DU, JU, or SUST.");
                System.out.println("4. Gain Experience: Volunteer with NGOs like BELA (Bangladesh Environmental Lawyers Association).");
                System.out.println("5. Conduct Research: Work on projects related to climate change or pollution in Bangladesh.");
                System.out.println("6. Seek Employment: Apply to government agencies or NGOs like IUCN Bangladesh.");
                System.out.println("7. Network: Join environmental forums and attend sustainability conferences.");
                break;
            case "Nutritionist":
                System.out.println("1. Study Science: Focus on Biology and Chemistry in school.");
                System.out.println("2. Learn Nutrition Basics: Read about healthy eating or take online nutrition courses.");
                System.out.println("3. Pursue Higher Education: Study Nutrition or Food Science at DU or BRAC University.");
                System.out.println("4. Gain Experience: Volunteer at health clinics or community nutrition programs.");
                System.out.println("5. Obtain Certification: Get certified by the Bangladesh Dietetic Association.");
                System.out.println("6. Work Locally: Join hospitals or NGOs focused on public health in Bangladesh.");
                System.out.println("7. Network: Attend nutrition seminars and connect with professionals.");
                break;
            case "Graphic Designer":
                System.out.println("1. Develop Art Skills: Practice drawing and design in school art classes or clubs.");
                System.out.println("2. Learn Design Software: Start with free tools like Canva or GIMP to create designs.");
                System.out.println("3. Pursue Higher Education: Study Graphic Design at DU (Fine Arts) or private institutes like Creative IT.");
                System.out.println("4. Build a Portfolio: Create posters or logos for school events or local businesses.");
                System.out.println("5. Gain Experience: Freelance on platforms like Fiverr or intern at ad agencies in Dhaka.");
                System.out.println("6. Master Tools: Learn Adobe Photoshop, Illustrator, or InDesign for professional work.");
                System.out.println("7. Network: Showcase your work on Behance and attend design meetups in Bangladesh.");
                break;
            case "Artist":
                System.out.println("1. Hone Your Art Skills: Practice drawing, painting, or sculpting in school art classes.");
                System.out.println("2. Explore Art Forms: Experiment with traditional Bangladeshi art (e.g., Nakshi Kantha) or modern styles.");
                System.out.println("3. Pursue Higher Education: Study Fine Arts at DU, JU, or Charukala Institute.");
                System.out.println("4. Build a Portfolio: Create a collection of your artwork for exhibitions or online platforms.");
                System.out.println("5. Gain Exposure: Participate in art exhibitions or sell work at local markets like Aarong.");
                System.out.println("6. Learn Digital Art: Use tools like Procreate or Adobe Fresco to expand your skills.");
                System.out.println("7. Network: Join art communities in Bangladesh and showcase work on Instagram or ArtStation.");
                break;
            case "Architect":
                System.out.println("1. Excel in Math and Art: Focus on Math, Physics, and Art in school.");
                System.out.println("2. Learn Design Basics: Practice sketching buildings or use free CAD software.");
                System.out.println("3. Pursue Higher Education: Study Architecture at BUET, BRAC, or AUST.");
                System.out.println("4. Gain Experience: Intern at architectural firms like Bashundhara Group or local studios.");
                System.out.println("5. Master Design Tools: Learn AutoCAD, Revit, or SketchUp for professional designs.");
                System.out.println("6. Build a Portfolio: Showcase your architectural designs and models.");
                System.out.println("7. Network: Join the Institute of Architects Bangladesh (IAB) for connections.");
                break;
            case "Fashion Designer":
                System.out.println("1. Develop Art Skills: Practice sketching and design in school art classes.");
                System.out.println("2. Learn About Fashion: Study traditional Bangladeshi textiles like Jamdani.");
                System.out.println("3. Pursue Higher Education: Study Fashion Design at BGMEA University or Shanto-Mariam University.");
                System.out.println("4. Build a Portfolio: Create clothing designs for school events or local clients.");
                System.out.println("5. Gain Experience: Intern at fashion houses like Aarong or Kay Kraft.");
                System.out.println("6. Learn Design Tools: Use software like Adobe Illustrator for fashion sketches.");
                System.out.println("7. Network: Attend fashion shows in Dhaka and showcase work online.");
                break;
            case "Animator":
                System.out.println("1. Practice Art and Storytelling: Develop drawing and storytelling skills in school.");
                System.out.println("2. Learn Animation Basics: Use free tools like Blender or Toonly to create animations.");
                System.out.println("3. Pursue Higher Education: Study Animation or Multimedia at DU or private institutes.");
                System.out.println("4. Build a Portfolio: Create short animation clips for school or online platforms.");
                System.out.println("5. Gain Experience: Intern at animation studios or media companies in Bangladesh.");
                System.out.println("6. Master Animation Tools: Learn Adobe After Effects, Maya, or Blender.");
                System.out.println("7. Network: Join animation communities and showcase work on YouTube or Vimeo.");
                break;
            case "Photographer":
                System.out.println("1. Practice Photography: Use a smartphone or camera to take photos in school.");
                System.out.println("2. Learn Photography Basics: Study composition and lighting through online tutorials.");
                System.out.println("3. Pursue Higher Education: Study Photography at Pathshala South Asian Media Institute.");
                System.out.println("4. Build a Portfolio: Create a collection of photos for events or nature in Bangladesh.");
                System.out.println("5. Gain Experience: Freelance for local events or intern at media agencies.");
                System.out.println("6. Learn Editing Tools: Master Adobe Lightroom or Photoshop for photo editing.");
                System.out.println("7. Network: Join photography clubs in Dhaka and showcase work on Instagram.");
                break;
            case "Interior Designer":
                System.out.println("1. Develop Art Skills: Practice sketching and design in school art classes.");
                System.out.println("2. Learn Design Principles: Study space planning and aesthetics online.");
                System.out.println("3. Pursue Higher Education: Study Interior Design at BRAC or Shanto-Mariam University.");
                System.out.println("4. Build a Portfolio: Design room layouts for school projects or family.");
                System.out.println("5. Gain Experience: Intern at interior design firms in Dhaka.");
                System.out.println("6. Master Design Tools: Learn AutoCAD, SketchUp, or 3ds Max.");
                System.out.println("7. Network: Join design communities and showcase work on Pinterest or Behance.");
                break;
            case "Chef/Culinary Artist":
                System.out.println("1. Practice Cooking: Experiment with recipes at home or in school home economics classes.");
                System.out.println("2. Learn Culinary Basics: Study Bangladeshi cuisine and international cooking techniques.");
                System.out.println("3. Pursue Higher Education: Study Culinary Arts at institutes like Bangladesh Institute of Tourism and Hospitality.");
                System.out.println("4. Gain Experience: Work as an assistant in local restaurants or hotels.");
                System.out.println("5. Build a Portfolio: Document your dishes with photos and recipes.");
                System.out.println("6. Learn Food Safety: Obtain certifications in food safety and hygiene.");
                System.out.println("7. Network: Join culinary associations and participate in food festivals in Bangladesh.");
                break;
            case "Craftsman/Artisan":
                System.out.println("1. Practice Craft Skills: Learn traditional crafts like pottery or weaving in school or community workshops.");
                System.out.println("2. Explore Local Crafts: Study Bangladeshi crafts like Nakshi Kantha or Shital Pati.");
                System.out.println("3. Pursue Training: Attend craft workshops at NGOs like Aarong or BRAC.");
                System.out.println("4. Build a Portfolio: Create a collection of your crafts for exhibitions.");
                System.out.println("5. Gain Experience: Sell crafts at local markets or online platforms.");
                System.out.println("6. Learn Business Skills: Study basic marketing to promote your work.");
                System.out.println("7. Network: Join artisan communities and showcase work at craft fairs.");
                break;
            case "Filmmaker":
                System.out.println("1. Develop Storytelling Skills: Practice storytelling through school drama or writing clubs.");
                System.out.println("2. Learn Filmmaking Basics: Use a smartphone to create short films and learn editing.");
                System.out.println("3. Pursue Higher Education: Study Film and Media at DU or Pathshala South Asian Media Institute.");
                System.out.println("4. Build a Portfolio: Create short films for school or local competitions.");
                System.out.println("5. Gain Experience: Intern at media companies or film studios in Dhaka.");
                System.out.println("6. Master Tools: Learn Adobe Premiere Pro or Final Cut Pro for editing.");
                System.out.println("7. Network: Join film festivals like Dhaka International Film Festival to connect with filmmakers.");
                break;
            case "Writer":
                System.out.println("1. Develop Writing Skills: Practice creative writing in school English classes.");
                System.out.println("2. Read Widely: Explore novels, essays, and Bangladeshi literature.");
                System.out.println("3. Pursue Higher Education: Study English Literature or Creative Writing at DU or JU.");
                System.out.println("4. Build a Portfolio: Write articles or stories for school magazines or blogs.");
                System.out.println("5. Gain Experience: Freelance for newspapers or online platforms like The Daily Star.");
                System.out.println("6. Learn Editing: Study grammar and style guides to refine your writing.");
                System.out.println("7. Network: Join writers’ groups in Bangladesh and attend literary events.");
                break;
            case "Journalist":
            case "Journalist (Investigative/Human Rights)":
                System.out.println("1. Develop Communication Skills: Join school journalism or debate clubs to hone writing and speaking skills.");
                System.out.println("2. Learn Journalism Basics: Study news writing and ethics through online courses or local workshops.");
                System.out.println("3. Pursue Higher Education: Enroll in a Journalism or Media Studies program at DU or BRAC University.");
                System.out.println("4. Build a Portfolio: Write investigative or human rights articles for school newspapers or local blogs.");
                System.out.println("5. Gain Experience: Intern at media houses like Prothom Alo, The Daily Star, or BBC Bangla.");
                System.out.println("6. Master Digital Tools: Learn video editing, podcasting, or social media for modern journalism.");
                System.out.println("7. Network: Join the Bangladesh Journalists’ Association and attend media events in Dhaka.");
                break;
            case "Editor":
                System.out.println("1. Hone Writing Skills: Practice editing essays or stories in school English classes.");
                System.out.println("2. Learn Editing Basics: Study grammar, style guides, and editing techniques online (e.g., Chicago Manual of Style).");
                System.out.println("3. Pursue Higher Education: Study English, Journalism, or Publishing at DU or JU.");
                System.out.println("4. Build a Portfolio: Edit school magazines, newsletters, or volunteer for local publications.");
                System.out.println("5. Gain Experience: Intern at publishing houses or newspapers like The Daily Star in Bangladesh.");
                System.out.println("6. Master Tools: Learn editing software like Grammarly, ProWritingAid, or Adobe InCopy.");
                System.out.println("7. Network: Join publishing networks and attend literary events in Dhaka.");
                break;
            case "Researcher":
                System.out.println("1. Develop Analytical Skills: Participate in school science fairs, debate clubs, or research competitions.");
                System.out.println("2. Learn Research Methods: Study basic research techniques through online courses (e.g., Coursera).");
                System.out.println("3. Pursue Higher Education: Study a relevant field like Sociology, Economics, or Science at DU, JU, or SUST.");
                System.out.println("4. Gain Experience: Assist in research projects at school or local universities.");
                System.out.println("5. Build a Portfolio: Publish research papers or present findings at school or local conferences.");
                System.out.println("6. Learn Tools: Master research tools like SPSS, R, or qualitative analysis software like NVivo.");
                System.out.println("7. Network: Join research communities and attend academic conferences in Bangladesh.");
                break;
            case "University Lecturer":
                System.out.println("1. Excel in Your Subject: Focus on a subject you love (e.g., Math, History) in school.");
                System.out.println("2. Develop Teaching Skills: Practice explaining concepts to peers or younger students.");
                System.out.println("3. Pursue Higher Education: Obtain a master’s or PhD in your field at DU, JU, or abroad.");
                System.out.println("4. Gain Experience: Work as a teaching assistant during university or volunteer as a tutor.");
                System.out.println("5. Build a Portfolio: Publish research or present at academic conferences to establish expertise.");
                System.out.println("6. Apply for Jobs: Seek lecturer positions at universities like DU, NSU, or BRAC.");
                System.out.println("7. Network: Join academic associations in Bangladesh and attend educational conferences.");
                break;
            case "Lawyer":
                System.out.println("1. Develop Communication Skills: Participate in school debates, public speaking, or mock trials.");
                System.out.println("2. Learn About Law: Read about the Bangladeshi legal system or take online law courses.");
                System.out.println("3. Pursue Higher Education: Study Law (LLB) at DU, BUP, or BRAC University.");
                System.out.println("4. Gain Experience: Intern at law firms or legal aid organizations like BLAST in Bangladesh.");
                System.out.println("5. Pass the Bar Exam: Enroll in the Bangladesh Bar Council to practice law.");
                System.out.println("6. Specialize: Focus on areas like criminal law, corporate law, or human rights law.");
                System.out.println("7. Network: Join the Bangladesh Bar Association for professional connections.");
                break;
            case "Economist":
                System.out.println("1. Excel in Math and Economics: Focus on these subjects in school and join economics clubs.");
                System.out.println("2. Learn Economic Concepts: Study micro and macroeconomics through online resources or books.");
                System.out.println("3. Pursue Higher Education: Study Economics at DU, NSU, or BRAC University.");
                System.out.println("4. Gain Experience: Intern at banks like Bangladesh Bank or research institutes like BIDS.");
                System.out.println("5. Build a Portfolio: Conduct economic analyses or write reports for school projects.");
                System.out.println("6. Learn Analytical Tools: Master Stata, Excel, or R for economic modeling.");
                System.out.println("7. Network: Join economic forums and attend conferences in Bangladesh.");
                break;
            case "Marketing Specialist":
                System.out.println("1. Develop Communication Skills: Join school marketing, debate, or advertising clubs.");
                System.out.println("2. Learn Marketing Basics: Study digital marketing through online courses (e.g., Google Digital Garage).");
                System.out.println("3. Pursue Higher Education: Study Marketing or Business Administration at IBA (DU), NSU, or BRAC.");
                System.out.println("4. Gain Experience: Intern at marketing agencies like Asiatic or Bitopi in Dhaka.");
                System.out.println("5. Build a Portfolio: Create marketing campaigns for school events or local businesses.");
                System.out.println("6. Master Tools: Learn Google Analytics, SEO, or social media marketing platforms.");
                System.out.println("7. Network: Join marketing associations and attend industry events in Bangladesh.");
                break;
            case "Public Relations Manager":
                System.out.println("1. Hone Communication Skills: Participate in school public speaking, drama, or PR clubs.");
                System.out.println("2. Learn PR Basics: Study public relations through online courses or local workshops.");
                System.out.println("3. Pursue Higher Education: Study PR, Communication, or Journalism at DU or BRAC University.");
                System.out.println("4. Gain Experience: Intern at PR firms or corporate PR departments in Bangladesh.");
                System.out.println("5. Build a Portfolio: Create PR campaigns for school or community events.");
                System.out.println("6. Learn Digital Tools: Master social media management and media monitoring tools.");
                System.out.println("7. Network: Join PR associations and attend media events in Dhaka.");
                break;
            case "Policy Analyst":
                System.out.println("1. Develop Analytical Skills: Join school debate or social science clubs to build critical thinking.");
                System.out.println("2. Learn About Policy: Study Bangladeshi policies through news or online resources.");
                System.out.println("3. Pursue Higher Education: Study Public Policy or Social Sciences at DU, BUP, or BRAC University.");
                System.out.println("4. Gain Experience: Intern at NGOs or government agencies like the Planning Commission.");
                System.out.println("5. Build a Portfolio: Write policy briefs or analyses for school or community projects.");
                System.out.println("6. Learn Analytical Tools: Master data analysis or policy evaluation methods.");
                System.out.println("7. Network: Join policy forums and attend conferences in Bangladesh.");
                break;
            case "Game Developer":
                System.out.println("1. Learn ICT and Math: Focus on these subjects in school and join coding clubs.");
                System.out.println("2. Learn Game Development: Start with tools like Scratch or Unity (free versions).");
                System.out.println("3. Pursue Higher Education: Study Computer Science at BUET or NSU (optional for game development).");
                System.out.println("4. Build a Portfolio: Create simple games for school or online platforms like Itch.io.");
                System.out.println("5. Gain Experience: Intern at game studios or freelance on platforms like Upwork.");
                System.out.println("6. Master Tools: Learn Unity, Unreal Engine, or Godot for professional development.");
                System.out.println("7. Network: Join game dev communities and showcase games on Itch.io or Steam.");
                break;
            case "Industrial Designer":
                System.out.println("1. Develop Art and Math Skills: Focus on Art and Geometry in school.");
                System.out.println("2. Learn Design Basics: Practice sketching products or use free CAD tools like Fusion 360.");
                System.out.println("3. Pursue Higher Education: Study Industrial Design or Engineering at BUET or AUST.");
                System.out.println("4. Build a Portfolio: Design products for school projects or competitions.");
                System.out.println("5. Gain Experience: Intern at manufacturing firms or design studios in Bangladesh.");
                System.out.println("6. Master Tools: Learn SolidWorks or Adobe Illustrator for product design.");
                System.out.println("7. Network: Join design communities and showcase work on Behance or Dribbble.");
                break;
            case "Robotics Engineer":
                System.out.println("1. Excel in Science and ICT: Focus on Physics, Math, and ICT in school.");
                System.out.println("2. Learn Robotics Basics: Experiment with robotics kits or Arduino projects.");
                System.out.println("3. Pursue Higher Education: Study Robotics or Mechatronics at BUET or SUST.");
                System.out.println("4. Build Projects: Create robots for school science fairs or competitions.");
                System.out.println("5. Gain Experience: Intern at tech companies or research labs in Bangladesh.");
                System.out.println("6. Master Tools: Learn ROS (Robot Operating System) or MATLAB for robotics.");
                System.out.println("7. Network: Join robotics clubs and attend tech conferences in Dhaka.");
                break;
            case "Multimedia Specialist":
                System.out.println("1. Develop Art and ICT Skills: Focus on Art and ICT in school.");
                System.out.println("2. Learn Multimedia Basics: Practice video editing or graphic design with free tools like DaVinci Resolve.");
                System.out.println("3. Pursue Higher Education: Study Multimedia or Film at DU or private institutes.");
                System.out.println("4. Build a Portfolio: Create videos or graphics for school events or online platforms.");
                System.out.println("5. Gain Experience: Intern at media companies or ad agencies in Bangladesh.");
                System.out.println("6. Master Tools: Learn Adobe Premiere, After Effects, or Photoshop for multimedia work.");
                System.out.println("7. Network: Join multimedia communities and showcase work on YouTube or Vimeo.");
                break;
            case "Health Informatics Specialist":
                System.out.println("1. Focus on Science and ICT: Excel in Biology and ICT in school.");
                System.out.println("2. Learn Health IT Basics: Study health data systems through online courses (e.g., Coursera).");
                System.out.println("3. Pursue Higher Education: Study Health Informatics or IT at DU or BRAC University.");
                System.out.println("4. Gain Experience: Intern at hospitals or health tech companies like Augmedix in Bangladesh.");
                System.out.println("5. Build Skills: Learn EHR systems or data analysis tools like Python or SQL.");
                System.out.println("6. Obtain Certifications: Pursue certifications like CHDA (Certified Health Data Analyst).");
                System.out.println("7. Network: Join health IT forums and attend healthcare conferences in Bangladesh.");
                break;
            case "Biomedical Engineer":
                System.out.println("1. Excel in Science: Focus on Biology, Physics, and Math in school.");
                System.out.println("2. Learn Engineering Basics: Experiment with electronics or medical device projects.");
                System.out.println("3. Pursue Higher Education: Study Biomedical Engineering at BUET or SUST.");
                System.out.println("4. Build Projects: Work on medical device prototypes for school fairs or competitions.");
                System.out.println("5. Gain Experience: Intern at hospitals or biomedical firms in Bangladesh.");
                System.out.println("6. Master Tools: Learn MATLAB or CAD for medical device design.");
                System.out.println("7. Network: Join biomedical engineering societies and attend conferences.");
                break;
            case "Medical Technologist":
                System.out.println("1. Focus on Science: Excel in Biology and Chemistry in school.");
                System.out.println("2. Learn Lab Techniques: Volunteer at school labs or community health camps.");
                System.out.println("3. Pursue Higher Education: Study Medical Technology at BSMMU or DU.");
                System.out.println("4. Gain Experience: Intern at diagnostic labs like Ibn Sina or Popular in Bangladesh.");
                System.out.println("5. Obtain Certification: Register with the Bangladesh Medical Technologist Association.");
                System.out.println("6. Learn Equipment: Master lab equipment and diagnostic tools.");
                System.out.println("7. Network: Join health professional networks and attend medical conferences.");
                break;
            case "Public Health Researcher":
                System.out.println("1. Study Science and Social Studies: Focus on Biology and Social Sciences in school.");
                System.out.println("2. Learn Research Basics: Study public health issues like sanitation or disease in Bangladesh.");
                System.out.println("3. Pursue Higher Education: Study Public Health at BRAC University or BSMMU.");
                System.out.println("4. Gain Experience: Volunteer with NGOs like BRAC or icddr,b for health projects.");
                System.out.println("5. Build a Portfolio: Conduct health research for school or community projects.");
                System.out.println("6. Learn Tools: Master statistical tools like SPSS or R for health data analysis.");
                System.out.println("7. Network: Join public health forums and attend conferences in Bangladesh.");
                break;
            case "Data Scientist in Social Sector":
                System.out.println("1. Excel in Math and ICT: Focus on these subjects and join data or coding clubs.");
                System.out.println("2. Learn Data Analysis: Start with Python or Excel for social data projects.");
                System.out.println("3. Pursue Higher Education: Study Data Science or Statistics at DU or NSU.");
                System.out.println("4. Gain Experience: Intern at NGOs like BRAC or government data initiatives.");
                System.out.println("5. Build a Portfolio: Analyze social issues like education or poverty in Bangladesh.");
                System.out.println("6. Master Tools: Learn Pandas, Tableau, or Power BI for data visualization.");
                System.out.println("7. Network: Join data science and social sector communities in Bangladesh.");
                break;
            case "Social Scientist":
                System.out.println("1. Study Social Studies: Excel in Sociology, History, or Social Studies in school.");
                System.out.println("2. Learn Research Methods: Study social research techniques through online courses.");
                System.out.println("3. Pursue Higher Education: Study Sociology or Anthropology at DU or JU.");
                System.out.println("4. Gain Experience: Volunteer with NGOs or community projects for social research.");
                System.out.println("5. Build a Portfolio: Conduct social research on local issues like education or gender equality.");
                System.out.println("6. Learn Tools: Master qualitative analysis tools like NVivo or quantitative tools like SPSS.");
                System.out.println("7. Network: Join social science forums and attend academic conferences.");
                break;
            case "NGO Program Manager":
                System.out.println("1. Engage in Community Work: Join school clubs focused on volunteering or social service.");
                System.out.println("2. Learn Management Basics: Take online courses on project management or leadership (e.g., Coursera).");
                System.out.println("3. Pursue Higher Education: Study Social Work, Public Administration, or Development Studies at DU, JU, or BRAC University.");
                System.out.println("4. Gain Experience: Volunteer or intern with NGOs like BRAC, Grameen Bank, or Save the Children in Bangladesh.");
                System.out.println("5. Develop Skills: Learn budgeting, grant writing, and program evaluation techniques.");
                System.out.println("6. Seek Employment: Apply for program coordinator roles at NGOs or government development projects.");
                System.out.println("7. Network: Join the Bangladesh NGO Foundation and attend development sector conferences.");
                break;
            case "Technical Writer":
                System.out.println("1. Develop Writing Skills: Practice technical writing in school English or ICT classes.");
                System.out.println("2. Learn Technical Concepts: Study technology or science topics to understand technical documentation.");
                System.out.println("3. Pursue Higher Education: Study English, Journalism, or Technical Communication at DU or BRAC University.");
                System.out.println("4. Build a Portfolio: Write manuals or guides for school projects or local businesses.");
                System.out.println("5. Gain Experience: Intern at tech companies like DataSoft or Grameenphone IT in Bangladesh.");
                System.out.println("6. Master Tools: Learn tools like MadCap Flare, Adobe RoboHelp, or Markdown for documentation.");
                System.out.println("7. Network: Join technical writing communities and showcase work on LinkedIn or GitHub.");
                break;
            case "Museum Curator":
                System.out.println("1. Study History and Arts: Focus on History, Social Studies, or Art in school.");
                System.out.println("2. Learn About Museums: Visit museums like the Bangladesh National Museum to understand curation.");
                System.out.println("3. Pursue Higher Education: Study History, Anthropology, or Museum Studies at DU or JU.");
                System.out.println("4. Gain Experience: Volunteer at local museums or cultural organizations.");
                System.out.println("5. Build a Portfolio: Curate small exhibitions for school or community events.");
                System.out.println("6. Learn Curation Skills: Study collection management and exhibition design.");
                System.out.println("7. Network: Join the Bangladesh Museum Association and attend cultural events.");
                break;
            case "Documentary Filmmaker":
                System.out.println("1. Develop Storytelling Skills: Practice storytelling through school drama or writing clubs.");
                System.out.println("2. Learn Filmmaking Basics: Use a smartphone to create short documentaries and learn editing.");
                System.out.println("3. Pursue Higher Education: Study Film and Media at DU or Pathshala South Asian Media Institute.");
                System.out.println("4. Build a Portfolio: Create documentaries on local issues like culture or environment in Bangladesh.");
                System.out.println("5. Gain Experience: Intern at media companies or NGOs producing documentaries.");
                System.out.println("6. Master Tools: Learn Adobe Premiere Pro or DaVinci Resolve for professional editing.");
                System.out.println("7. Network: Join film festivals like Dhaka International Film Festival to connect with filmmakers.");
                break;
            case "Content Creator":
                System.out.println("1. Develop Creative Skills: Practice writing, video editing, or photography in school.");
                System.out.println("2. Learn Digital Content Creation: Create content using free tools like Canva or CapCut.");
                System.out.println("3. Pursue Higher Education: Study Media, Journalism, or Marketing at DU or BRAC (optional).");
                System.out.println("4. Build a Portfolio: Create blogs, videos, or social media posts for school or personal projects.");
                System.out.println("5. Gain Experience: Freelance on platforms like YouTube or TikTok, or intern at media agencies.");
                System.out.println("6. Master Tools: Learn video editing (Premiere Pro) and graphic design (Photoshop) software.");
                System.out.println("7. Network: Join content creator communities in Bangladesh and showcase work online.");
                break;
            case "Architectural Historian":
                System.out.println("1. Study History and Art: Focus on History and Art in school to understand architectural heritage.");
                System.out.println("2. Learn About Architecture: Visit historical sites like Lalbagh Fort or read about Bangladeshi architecture.");
                System.out.println("3. Pursue Higher Education: Study History, Architecture, or Archaeology at DU or JU.");
                System.out.println("4. Gain Experience: Volunteer at heritage organizations or museums in Bangladesh.");
                System.out.println("5. Build a Portfolio: Write articles or research papers on architectural history.");
                System.out.println("6. Learn Research Tools: Master archival research and documentation techniques.");
                System.out.println("7. Network: Join heritage conservation groups and attend cultural conferences.");
                break;
            case "Agricultural Scientist":
                System.out.println("1. Focus on Science: Excel in Biology, Chemistry, and Agriculture in school.");
                System.out.println("2. Learn About Farming: Visit farms or learn about Bangladeshi agriculture practices.");
                System.out.println("3. Pursue Higher Education: Study Agricultural Science at Bangladesh Agricultural University or SUST.");
                System.out.println("4. Gain Experience: Volunteer with agricultural NGOs or research institutes like BARI.");
                System.out.println("5. Conduct Research: Work on projects related to crop improvement or sustainable farming.");
                System.out.println("6. Learn Tools: Master lab techniques or data analysis for agricultural research.");
                System.out.println("7. Network: Join agricultural research communities and attend farming conferences.");
                break;
            case "Textile Designer":
                System.out.println("1. Develop Art Skills: Practice sketching and design in school art classes.");
                System.out.println("2. Learn About Textiles: Study traditional Bangladeshi textiles like Jamdani or Muslin.");
                System.out.println("3. Pursue Higher Education: Study Textile Design at BGMEA University or Shanto-Mariam University.");
                System.out.println("4. Build a Portfolio: Create textile designs for school or local exhibitions.");
                System.out.println("5. Gain Experience: Intern at textile companies like Aarong or Beximco Textiles.");
                System.out.println("6. Master Tools: Learn Adobe Illustrator or textile CAD software for design.");
                System.out.println("7. Network: Join textile design communities and attend fashion or craft fairs.");
                break;
            case "Tourism Specialist":
                System.out.println("1. Study Geography and Social Studies: Focus on these subjects to understand tourism.");
                System.out.println("2. Learn About Tourism: Explore Bangladesh’s tourist spots like Cox’s Bazar or Sundarbans.");
                System.out.println("3. Pursue Higher Education: Study Tourism and Hospitality at DU or Bangladesh Institute of Tourism.");
                System.out.println("4. Gain Experience: Volunteer as a guide or intern at travel agencies in Bangladesh.");
                System.out.println("5. Build Skills: Learn customer service and tour planning techniques.");
                System.out.println("6. Seek Employment: Apply to tourism boards or agencies like Bengal Tours.");
                System.out.println("7. Network: Join tourism associations and attend travel expos in Bangladesh.");
                break;
            case "Accountant":
                System.out.println("1. Excel in Math and Commerce: Focus on Mathematics and Accounting in school.");
                System.out.println("2. Learn Accounting Basics: Study bookkeeping and financial statements online (e.g., Coursera).");
                System.out.println("3. Pursue Higher Education: Study Accounting at IBA (DU), NSU, or BRAC University.");
                System.out.println("4. Gain Experience: Intern at accounting firms like Rahman Rahman Huq or ACNABIN in Bangladesh.");
                System.out.println("5. Build Skills: Master accounting software like QuickBooks or Tally.");
                System.out.println("6. Obtain Certifications: Pursue ACCA or CPA certifications for professional recognition.");
                System.out.println("7. Network: Join the Institute of Chartered Accountants of Bangladesh (ICAB) for connections.");
                break;
            case "Business Manager":
                System.out.println("1. Develop Leadership Skills: Join school clubs or take leadership roles in projects.");
                System.out.println("2. Learn Business Basics: Study business concepts through online courses or school commerce classes.");
                System.out.println("3. Pursue Higher Education: Study Business Administration at IBA (DU), NSU, or BRAC University.");
                System.out.println("4. Gain Experience: Intern at companies like Unilever Bangladesh or Grameenphone.");
                System.out.println("5. Build Skills: Learn project management, budgeting, and team leadership.");
                System.out.println("6. Seek Employment: Apply for management roles in corporate or startup sectors.");
                System.out.println("7. Network: Join business associations like DCCI (Dhaka Chamber of Commerce and Industry).");
                break;
            case "General":
                System.out.println("1. Explore Your Interests: Try different subjects and activities in school to find your passion.");
                System.out.println("2. Develop Core Skills: Focus on communication, critical thinking, and teamwork through school clubs.");
                System.out.println("3. Pursue Higher Education: Choose a degree that aligns with your interests at DU, JU, or NSU.");
                System.out.println("4. Gain Experience: Volunteer or intern in various fields to explore career options.");
                System.out.println("5. Build a Portfolio: Document your projects or achievements to showcase your skills.");
                System.out.println("6. Learn Versatile Tools: Master skills like Microsoft Office or basic coding for flexibility.");
                System.out.println("7. Network: Attend career fairs and connect with professionals in Bangladesh.");
                break;
            default:
                System.out.println("Career path not found. Research your desired profession and explore educational opportunities!");
                break;
        }
        System.out.println("--- End of Guideline ---");
    }

}

