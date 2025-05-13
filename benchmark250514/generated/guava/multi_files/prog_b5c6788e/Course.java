import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Integer> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(int studentId) {
        enrolledStudents.add(studentId);
    }

    public List<Integer> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}
