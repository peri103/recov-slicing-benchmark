import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize BagOperations and add an element
        BagOperations bagOps = new BagOperations();
        bagOps.addElement("example");

        // Initialize a student and enroll in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Math");
        student.enrollCourse("Science");

        // Display student info
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers: " + Arrays.toString(numbers));

        // Finally read the count from the PredicatedBag
        /* read */ int count = bagOps.getPredicatedBag().getCount("example");
        System.out.println("Count of 'example': " + count);
    }
}