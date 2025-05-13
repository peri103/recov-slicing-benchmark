import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipHandler
        GzipHandler gzipHandler = new GzipHandler();
        
        // Set extra flags
        gzipHandler.setExtraFlags(1);
        
        // Create a course and students
        Course course = new Course("Math 101");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores to students
        alice.addScore(85);
        bob.addScore(90);

        // Add students to the course
        course.addStudent(alice);
        course.addStudent(bob);

        // Process course data
        System.out.println("Course Name: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Scores: " + student.getScores());
        }

        // Retrieve extra flags
        /* read */ int extraFlags = gzipHandler.getExtraFlags();
        System.out.println("Extra Flags: " + extraFlags);

        // Additional data processing
        Map<String, Integer> studentScores = new HashMap<>();
        for (Student student : course.getStudents()) {
            studentScores.put(student.getName(), student.getScores().get(0));
        }

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }

        // Final message
        System.out.println("Program completed successfully.");
    }
}