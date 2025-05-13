import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.submitAssignment("Math Homework");
        student.submitAssignment("Science Project");

        // Perform some unrelated operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // More complex operations
        double x = 3.14;
        double y = 2.71;
        double product = x * y;
        System.out.println("Product: " + product);

        // Finally, read the assignments
        Collection<String> assignments = student.viewAssignments();
        /* read */ for (String assignment : assignments) {
            System.out.println("Assignment: " + assignment);
        }
    }
}