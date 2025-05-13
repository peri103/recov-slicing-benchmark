import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.List;

public class StudentScores {
    private Multimap<Integer, Integer> scoresMap = ArrayListMultimap.create();

    public void addScore(int studentId, int score) {
        /* write */ scoresMap.put(studentId, score);
    }

    public List<Integer> getScoresForStudent(int studentId) {
        return (List<Integer>) scoresMap.get(studentId);
    }
}
