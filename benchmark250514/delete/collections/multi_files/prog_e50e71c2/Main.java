import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.enrollCourse("Math");
        student1.enrollCourse("Science");
        student2.enrollCourse("History");

        // Additional complexity with a Map to store student scores
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put(student1.getName(), 90);
        studentScores.put(student2.getName(), 85);

        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Read from the UnmodifiableMultiValuedMap
        System.out.println("Courses for Alice:");
        /* read */ System.out.println(student1.getCourses().getCourseMap().get("courses"));

        // Further operations to increase complexity
        int totalScore = 0;
        for (int score : studentScores.values()) {
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore);
    }
}