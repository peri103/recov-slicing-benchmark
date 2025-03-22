import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

public class StudentScores {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

    public void addScore(int score) {
        scores.add(score);
        /* write */ map.put("latestScore", score);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public Integer getLatestScore() {
        /* read */ return map.get("latestScore");
    }
}
