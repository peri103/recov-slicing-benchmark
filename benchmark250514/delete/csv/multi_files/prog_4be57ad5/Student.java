import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> scores = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        scores.put(subject, score);
    }

    public Map<String, Integer> getScores() {
        return scores;
    }
}
