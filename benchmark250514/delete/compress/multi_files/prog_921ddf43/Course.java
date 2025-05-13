import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = new HashMap<>();
    }

    public void addStudentScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public Map<String, Integer> getStudentScores() {
        return studentScores;
    }

    public int getTotalScore() {
        int total = 0;
        for (int score : studentScores.values()) {
            total += score;
        }
        return total;
    }
}
