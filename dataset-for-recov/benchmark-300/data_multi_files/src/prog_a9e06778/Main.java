import java.util.concurrent.ConcurrentSkipListSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        Student student = new Student("Alice");

        // Enroll the student in the course
        course.enrollStudent(student.getName());

        // Add some random scores to the student
        for (int i = 0; i < 5; i++) {
            student.addScore();
        }

        // Print the student's scores
        System.out.println("Student " + student.getName() + " scores: " + student.getScores());

        // Check if the student is enrolled in the course
        ConcurrentSkipListSet<String> enrolledStudents = course.getEnrolledStudents();
        /* read */ boolean isEnrolled = enrolledStudents.contains(student.getName());
        System.out.println("Is " + student.getName() + " enrolled in " + course.getName() + "? " + isEnrolled);

        // Print all enrolled students
        System.out.println("Enrolled students in " + course.getName() + ": " + enrolledStudents);
    }
}