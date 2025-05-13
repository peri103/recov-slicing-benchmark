import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<Integer, String> students = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(int studentId, String studentName) {
        /* write */ students.put(studentId, studentName);
    }

    public String getStudentName(int studentId) {
        return students.get(studentId);
    }

    public String getCourseName() {
        return courseName;
    }
}
