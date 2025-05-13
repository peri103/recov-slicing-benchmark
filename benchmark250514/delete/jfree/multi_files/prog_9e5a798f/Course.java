import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Double> studentGrades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentGrades = new HashMap<>();
    }

    public void addStudentGrade(String studentName, double grade) {
        studentGrades.put(studentName, grade);
    }

    public double getStudentGrade(String studentName) {
        return studentGrades.getOrDefault(studentName, 0.0);
    }

    public Map<String, Double> getAllGrades() {
        return studentGrades;
    }
}
