import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Student> students = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        students.put(studentName, new Student(studentName));
    }

    public Student getStudent(String studentName) {
        return students.get(studentName);
    }
}
