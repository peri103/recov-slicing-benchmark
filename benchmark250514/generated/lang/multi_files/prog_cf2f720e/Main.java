import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a StringManipulator object and perform operations
        StringManipulator manipulator = new StringManipulator("Hello World!");
        manipulator.deleteSubstring("World");

        // Create a Course and enroll students
        Course javaCourse = new Course("Java Programming");
        javaCourse.enrollStudent(new Student("Alice", 20));
        javaCourse.enrollStudent(new Student("Bob", 22));

        // Display enrolled students
        List<Student> students = javaCourse.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Read the modified string from StringManipulator
        /* read */ String result = manipulator.getString();
        System.out.println("Modified String: " + result);
    }
}