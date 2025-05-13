import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize TextManipulator and replace text
        TextManipulator textManipulator = new TextManipulator("Hello World");
        textManipulator.replaceText(6, 11, "Java");

        // Create a course and enroll students
        Course course = new Course("Java Programming");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");

        // Print enrolled students
        for (String student : course.getEnrolledStudents()) {
            System.out.println(student + " is enrolled in " + course.getCourseName());
        }

        // Read the modified text from TextManipulator
        /* read */ String result = textManipulator.getStrBuilder().toString();
        System.out.println("Modified Text: " + result);

        // Additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}