import java.util.HashMap;

public class StudentScores {
    private HashMap<String, Integer> scores = new HashMap<>();

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public HashMap<String, Integer> getScores() {
        return scores;
    }
}
