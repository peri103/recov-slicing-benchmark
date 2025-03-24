import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
