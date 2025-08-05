import java.util.*;
import java.util.stream.*;


public  class MentalHealth{
    static Scanner sc = new Scanner(System.in);
    public static class Psychologist {
        String name;
        String specialization;
        String contact;

        public Psychologist(String name, String specialization, String contact) {
            this.name = name;
            this.specialization = specialization;
            this.contact = contact;
        }

        @Override
        public String toString() {
            return "Dr. " + name + " (Specialization: " + specialization + ", Contact: " + contact + ")";
        }
    }

    static List<Psychologist> psychologists = new ArrayList<>();

    static {
        psychologists.add(new Psychologist("Aisha Rahman", "Stress Management, Anxiety", "01XXXXXXXXX1"));
        psychologists.add(new Psychologist("Kamal Hossain", "Academic Pressure, Depression", "01XXXXXXXXX2"));
        psychologists.add(new Psychologist("Sara Begum", "Adolescent Psychology, Family Counseling", "01XXXXXXXXX3"));
        psychologists.add(new Psychologist("Robiul Islam", "Cognitive Behavioral Therapy (CBT), Exam Stress", "01XXXXXXXXX4"));
    }

    public static void support() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("              🌱 Mental Health Support Center");
        System.out.println("=".repeat(60));

        System.out.print("How are you feeling today? (e.g., stressed, anxious, happy, tired): ");
        String feeling = sc.nextLine().trim();

        int stressLevel = 0;
        while (stressLevel < 1 || stressLevel > 5) {
            System.out.println("On a scale of 1 to 5, how would you rate your stress level today? (1 = low, 5 = very high)");
            System.out.print("Your stress level: ");
            try {
                stressLevel = Integer.parseInt(sc.nextLine().trim());
                if (stressLevel < 1 || stressLevel > 5) {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.print("Have you been sleeping well lately? (yes/no): ");
        String sleep = sc.nextLine().trim().toLowerCase();

        System.out.print("Do you find it hard to concentrate on your studies or tasks? (yes/no): ");
        String concentration = sc.nextLine().trim().toLowerCase();

        System.out.print("Have you been spending time with friends or family recently? (yes/no): ");
        String social = sc.nextLine().trim().toLowerCase();

        System.out.println("\n" + "-".repeat(60));
        System.out.println("Thank you for sharing. Here is some personalized advice:");
        System.out.println("-".repeat(60));

        if (feeling.toLowerCase().contains("stressed") || feeling.toLowerCase().contains("anxious") || stressLevel >= 4) {
            System.out.println("🔹 You seem to be under significant pressure. Take deep breaths and short breaks.");
            System.out.println("🔹 Try to identify the main source of your stress. Naming it can reduce its impact.");
        } else if (feeling.toLowerCase().contains("happy")) {
            System.out.println("🔹 Great to hear you're feeling happy! Keep doing what brings you joy.");
        } else if (feeling.toLowerCase().contains("tired")) {
            System.out.println("🔹 Fatigue can affect your mood. Prioritize rest and consider light physical activity.");
        } else {
            System.out.println("🔹 Your feelings are valid. Acknowledge them and seek support if needed.");
        }

        if (sleep.equals("no")) {
            System.out.println("🔹 Poor sleep affects mental well-being. Try to maintain a consistent sleep schedule.");
            System.out.println("🔹 Avoid screens before bedtime and create a calming nighttime routine.");
        } else {
            System.out.println("🔹 Good sleep is essential for mental health. Keep up the healthy habits!");
        }

        if (concentration.equals("yes")) {
            System.out.println("🔹 Break tasks into smaller, manageable parts.");
            System.out.println("🔹 Try the Pomodoro Technique: 25 minutes of focused work, 5-minute break.");
        }

        if (social.equals("no")) {
            System.out.println("🔹 Social connection boosts mood. Reach out to a trusted friend or family member.");
            System.out.println("🔹 Even a short conversation can make a big difference.");
        } else {
            System.out.println("🔹 Staying connected is important for emotional well-being. Keep nurturing relationships!");
        }

        if (stressLevel >= 4) {
            System.out.println("\n❗ Your stress level is high. We strongly recommend professional support.");
            Psychologist recommended = getRecommendedPsychologist(feeling);
            System.out.println("👉 Recommended Psychologist: " + recommended);
            System.out.println("Please contact them for a consultation. They can offer personalized help.");
        } else if (stressLevel >= 2) {
            System.out.println("\nIf stress continues, consider speaking with a professional. Seeking help is a sign of strength.");
        } else {
            System.out.println("\nGlad your stress level is low. Keep practicing self-care and mindfulness!");
        }

        System.out.println("\n" + "📞 Mental Health Resources in Bangladesh:");
        System.out.println("   • National Helpline (Child & Mental Health): 1098 (24/7)");
        System.out.println("   • NIMH Mental Health Helpline: 02-9134938 (Dhaka)");
        System.out.println("   • Moner Bondhu (Phone Counseling): 01711223344");
        System.out.println("   • National Mental Health Helpline: 16263");
        System.out.println("   • Website: www.mind.org.bd");

        System.out.println("\n💡 Remember: Your mental health matters. Asking for help is courageous.");
        System.out.println("=".repeat(60));
        System.out.println("              Take care of yourself. You're not alone.");
        System.out.println("=".repeat(60) + "\n");
    }

    private static Psychologist getRecommendedPsychologist(String feeling) {
        String lowerFeeling = feeling.toLowerCase();
        Optional<Psychologist> match = psychologists.stream()
                .filter(p -> lowerFeeling.contains("anxious") && p.specialization.toLowerCase().contains("anxiety"))
                .findFirst();

        if (match.isEmpty()) {
            match = psychologists.stream()
                    .filter(p -> lowerFeeling.contains("stress") && p.specialization.toLowerCase().contains("stress"))
                    .findFirst();
        }

        if (match.isEmpty()) {
            match = psychologists.stream()
                    .filter(p -> lowerFeeling.contains("depress") && p.specialization.toLowerCase().contains("depression"))
                    .findFirst();
        }

        if (match.isEmpty()) {
            match = psychologists.stream()
                    .filter(p -> p.specialization.toLowerCase().contains("academic") || p.specialization.toLowerCase().contains("exam"))
                    .findFirst();
        }

        return match.orElse(psychologists.get(new Random().nextInt(psychologists.size())));
    }
}



