import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Process tokens
        TokenProcessor tokenProcessor = new TokenProcessor("apple;banana;cherry");
        tokenProcessor.setDelimiter(";");

        // Create a course and enroll students
        Course course = new Course("Biology 101");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");

        // Print enrolled students
        List<String> students = course.getEnrolledStudents();
        for (String student : students) {
            System.out.println("Enrolled student: " + student);
        }

        // Get the next token
        /* read */ String token = tokenProcessor.getNextToken();
        System.out.println("First token: " + token);

        // Additional course information
        System.out.println("Course Name: " + course.getCourseName());
    }
}