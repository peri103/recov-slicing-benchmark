import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseName;
    private Set<Integer> enrolledStudents = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(int studentId) {
        enrolledStudents.add(studentId);
    }

    public boolean isStudentEnrolled(int studentId) {
        return enrolledStudents.contains(studentId);
    }

    public int getTotalEnrolled() {
        return enrolledStudents.size();
    }
}
