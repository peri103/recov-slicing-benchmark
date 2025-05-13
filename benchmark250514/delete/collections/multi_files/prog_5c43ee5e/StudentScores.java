import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class StudentScores {
    private HashMap<String, Integer> scoreMap = new HashMap<>();
    private FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(scoreMap);

    public void addScore(String subject, int score) {
        /* write */ fixedSizeMap.put(subject, score);
    }

    public int getScore(String subject) {
        return fixedSizeMap.get(subject);
    }
}
