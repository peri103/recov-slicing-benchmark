import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));

        // Enroll students in the course
        for (Student student : students) {
            course.enrollStudent(student.getId());
        }

        // Unrelated operations
        int totalStudents = 0;
        for (Student student : students) {
            totalStudents++;
            System.out.println("Enrolled: " + student.getName());
        }
        System.out.println("Total students enrolled: " + totalStudents);

        // Check enrollment count for a specific student
        /* read */ int count = course.getStudentCount(1);
        System.out.println("Enrollment count for student ID 1: " + count);

        // Additional operations
        int sumOfIds = 0;
        for (Student student : students) {
            sumOfIds += student.getId();
        }
        System.out.println("Sum of student IDs: " + sumOfIds);
    }
}