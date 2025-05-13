import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ZipCommentManager
        ZipCommentManager zipManager = new ZipCommentManager("example.txt");
        zipManager.setComment("This is a comment.");

        // Create students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        // Create a course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print enrolled students
        course.printEnrolledStudents();

        // Unrelated computations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5 is: " + sum);

        // Read the comment from ZipCommentManager
        /* read */ String comment = zipManager.getComment();
        System.out.println("Comment: " + comment);

        // Another unrelated computation
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3 is: " + product);
    }
}