import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilderManager and modify content
        StrBuilderManager strBuilderManager = new StrBuilderManager("Hello, World!");
        strBuilderManager.modifyContent();

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);
        course.enrollStudent(alice);
        course.enrollStudent(bob);

        // Print enrolled students
        List<Student> students = course.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Read the modified content from StrBuilderManager
        /* read */ String result = strBuilderManager.getContent();
        System.out.println("Modified StrBuilder: " + result);
    }
}