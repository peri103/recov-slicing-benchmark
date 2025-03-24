import java.util.SortedMap;
import java.util.TreeMap;

public class StudentScores {
    private SortedMap<String, Integer> scores = new TreeMap<>();

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public SortedMap<String, Integer> getScores() {
        return scores;
    }
}
