import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private HashMap<String, Student> enrolledStudents = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.put(student.getName(), student);
    }

    public Map<String, Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}
