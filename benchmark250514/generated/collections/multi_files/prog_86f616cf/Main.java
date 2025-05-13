import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("1", "John Doe");

        // Add the student to the course
        course.addStudent(student.getId(), student.getName());

        // Create a map to hold student scores
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put(student.getId(), 95);

        // Print student scores
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Score: " + entry.getValue());
        }

        // Retrieve and print the student's name from the course
        /* read */ String studentName = course.getStudentName(student.getId());
        System.out.println("Student Name: " + studentName);

        // Perform some operations with the retrieved student name
        String greeting = "Hello, " + studentName + "!";
        System.out.println(greeting);
    }
}