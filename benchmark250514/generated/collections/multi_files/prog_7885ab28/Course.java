import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Integer> studentScores = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public Map<String, Integer> getStudentScores() {
        return studentScores;
    }
}
