import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public List<String> getStudents() {
        return students;
    }
}
