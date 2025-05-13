import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Integer> scores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.scores = new HashMap<>();
    }

    public void addStudentScore(String studentName, int score) {
        scores.put(studentName, score);
    }

    public int getTotalScore() {
        int total = 0;
        for (int score : scores.values()) {
            total += score;
        }
        return total;
    }
}
