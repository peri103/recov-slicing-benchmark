import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new StrManipulator
        StrManipulator manipulator = new StrManipulator("Hello, World!");

        // Perform various operations
        manipulator.deleteSection(5, 7);

        // Create a course and add students
        Course course = new Course("Computer Science 101");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print student names
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Read the manipulated string
        /* read */ String result = manipulator.getText();
        System.out.println(result);
    }
}