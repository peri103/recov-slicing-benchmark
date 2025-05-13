import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a GzipHandler and set CRC32 value
        GzipHandler gzipHandler = new GzipHandler();
        gzipHandler.setCRC32Value(123456789L);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Perform some unrelated operations
        Map<String, Integer> scoresMap = new HashMap<>();
        scoresMap.put("Alice", 90);
        scoresMap.put("Bob", 85);

        int totalScore = 0;
        for (Integer score : scoresMap.values()) {
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore);

        // Access the CRC32 value from GzipHandler
        /* read */ long crc32Value = gzipHandler.getCRC32Value();
        System.out.println("CRC32 Value: " + crc32Value);
    }
}