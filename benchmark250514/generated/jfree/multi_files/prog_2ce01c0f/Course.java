import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public List<String> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}
