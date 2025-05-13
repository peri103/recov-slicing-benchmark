import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, String> students = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentId, String studentName) {
        students.put(studentId, studentName);
    }

    public void displayStudents() {
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
