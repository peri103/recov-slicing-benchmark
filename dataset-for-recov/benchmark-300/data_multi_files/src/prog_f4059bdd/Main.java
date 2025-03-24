import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student(1, "Alice");

        // Enroll the student in the course
        course.enrollStudent(student.getId());

        // Check if the student is enrolled
        ConcurrentSkipListSet<Integer> studentIds = course.getStudentIds();
        /* read */ boolean isEnrolled = studentIds.contains(student.getId());

        System.out.println("Is student enrolled: " + isEnrolled);
    }
}