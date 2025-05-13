import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}