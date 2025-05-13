import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;

public class StudentScores {
    private PredicatedMap<Object, Object> scoreMap;

    public StudentScores() {
        Predicate<Object> keyPredicate = obj -> obj instanceof Integer;
        Predicate<Object> valuePredicate = obj -> obj instanceof String;
        HashMap<Object, Object> baseMap = new HashMap<>();
        this.scoreMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);
    }

    public void addScore(int testNumber, String score) {
        /* write */ scoreMap.put(testNumber, score);
    }

    public PredicatedMap<Object, Object> getScoreMap() {
        return scoreMap;
    }
}
