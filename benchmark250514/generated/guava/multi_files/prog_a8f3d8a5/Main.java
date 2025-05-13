import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course();
        Student student1 = new Student("John", mathCourse);
        Student student2 = new Student("Jane", mathCourse);

        student1.addScore(85);
        student2.addScore(90);

        Map<String, String> messages = new HashMap<>();
        messages.put("welcome", "Welcome to the course!");

        // Additional operations
        int[] array = {10, 20, 30};
        int total = 0;
        for (int num : array) {
            total += num;
        }
        System.out.println("Total: " + total);

        /* read */ List<Integer> johnScores = student1.getScores();
        System.out.println("John's first score: " + johnScores.get(0));

        String welcomeMessage = messages.get("welcome");
        System.out.println(welcomeMessage);

        // Iterating over messages
        for (Map.Entry<String, String> entry : messages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}