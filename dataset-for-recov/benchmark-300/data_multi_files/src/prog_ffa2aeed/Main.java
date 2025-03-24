import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.storeStudentData(1, "Hello, World!");

        Course course = new Course("Computer Science");
        course.enrollStudent(student);

        // Adding more students to the course
        Student student2 = new Student("Bob");
        course.enrollStudent(student2);

        // Retrieving data from the student
        /* read */ String value = student.getStudentData(1);
        System.out.println(value);

        // Printing enrolled students
        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + enrolledStudent);
        }
    }
}