import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Student> enrolledStudents = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.put(student.getName(), student);
    }

    public Student getStudent(String name) {
        return enrolledStudents.get(name);
    }

    public String getCourseName() {
        return courseName;
    }
}
