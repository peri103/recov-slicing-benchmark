import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a course and add students
        Course course = new Course("Computer Science");
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        System.out.println("Course: " + course.getCourseName());
        for (String student : course.getStudents()) {
            System.out.println("Enrolled Student: " + student);
        }

        // Initialize TokenizerHandler and configure tokenizer
        TokenizerHandler handler = new TokenizerHandler("Hello, World! This is a test.");
        handler.configureTokenizer();

        // Read the first token from the tokenizer
        /* read */ String token = handler.getTokenizer().nextToken();
        System.out.println("First token: " + token);

        // Additional operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}