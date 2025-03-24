import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.addData("Data1");
        student2.addData("Data2");

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student);
        }

        /* read */ boolean containsData1 = student1.checkData("Data1");
        System.out.println("Student1 contains 'Data1': " + containsData1);
    }
}