import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> studentNames;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentNames = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        studentNames.add(studentName);
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public String getCourseName() {
        return courseName;
    }
}
