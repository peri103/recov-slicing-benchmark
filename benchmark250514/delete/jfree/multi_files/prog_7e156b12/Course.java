import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
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
