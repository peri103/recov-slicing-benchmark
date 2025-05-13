import org.apache.commons.collections4.map.MultiValueMap;
import java.util.List;

public class StudentScores {
    private MultiValueMap<String, Integer> scores = new MultiValueMap<>();

    public void addScore(int score) {
        /* write */ scores.put("score", score);
    }

    public List<Integer> getScores() {
        return (List<Integer>) scores.get("score");
    }
}
