import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrManipulator manipulator = new StrManipulator("   Hello, World!   ");
        manipulator.trimString();

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ String trimmedString = manipulator.getString();
        System.out.println("Trimmed string: " + trimmedString);
    }
}