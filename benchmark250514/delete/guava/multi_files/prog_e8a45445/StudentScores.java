import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class StudentScores {
    private Multimap<String, Integer> scoreMap = ArrayListMultimap.create();

    public void addScore(int score) {
        /* write */ scoreMap.put("math", score);
    }

    public Multimap<String, Integer> getScoreMap() {
        return scoreMap;
    }
}
