import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TokenProcessor with some sample data
        TokenProcessor tokenProcessor = new TokenProcessor("apple,banana,orange");
        tokenProcessor.configureTokenizer();

        // Initialize a Course and enroll some students
        Course course = new Course("Computer Science");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");
        
        // Display enrolled students
        ArrayList<String> students = course.getEnrolledStudents();
        for (String student : students) {
            System.out.println("Enrolled student: " + student);
        }

        // Read the first token using the tokenizer
        StrTokenizer tokenizer = tokenProcessor.getTokenizer();
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);

        // Continue with more complex operations
        course.enrollStudent("Charlie");
        students = course.getEnrolledStudents();
        for (String student : students) {
            System.out.println("Updated enrolled student: " + student);
        }
    }
}