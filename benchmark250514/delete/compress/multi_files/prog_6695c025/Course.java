import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Integer> studentGrades = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName, int grade) {
        studentGrades.put(studentName, grade);
    }

    public int getStudentGrade(String studentName) {
        return studentGrades.getOrDefault(studentName, 0);
    }

    public String getCourseName() {
        return courseName;
    }
}
