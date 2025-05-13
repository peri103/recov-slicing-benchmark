import com.google.common.collect.ArrayListMultimap;
import java.util.List;

public class StudentScores {
    private ArrayListMultimap<String, Integer> scores = ArrayListMultimap.create();

    public void addScore(String studentId, int score) {
        /* write */ scores.put(studentId, score);
    }

    public List<Integer> getScores(String studentId) {
        return scores.get(studentId);
    }
}
