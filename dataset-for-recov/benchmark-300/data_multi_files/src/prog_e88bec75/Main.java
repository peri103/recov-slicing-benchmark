import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.storeScore("assignment1", 95);
        student2.storeScore("assignment1", 85);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            /* read */ int score = student.getScore("assignment1");
            System.out.println("Assignment 1 Score: " + score);
        }
    }
}