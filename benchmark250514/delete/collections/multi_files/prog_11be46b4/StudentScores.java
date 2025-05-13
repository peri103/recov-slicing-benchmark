import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.Collection;

public class StudentScores {
    private TreeValuedHashMap<String, Integer> scores = new TreeValuedHashMap<>();

    public void addScore(int score) {
        /* write */ scores.put("latestScore", score);
    }

    public Collection<Integer> getLatestScore() {
        return scores.get("latestScore");
    }

    public void addExtraScore(String key, int score) {
        scores.put(key, score);
    }

    public Collection<Integer> getScore(String key) {
        return scores.get(key);
    }
}
