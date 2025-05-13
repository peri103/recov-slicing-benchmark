import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.List;
import java.util.ArrayList;

public class StudentScores {
    private TreeValuedHashMap<String, Integer> scoresMap = new TreeValuedHashMap<>();
    private List<Integer> scoresList = new ArrayList<>();

    public void addScore(String subject, int score) {
        /* write */ scoresMap.put(subject, score);
        scoresList.add(score);
    }

    public List<Integer> getScores() {
        return scoresList;
    }

    public Integer getScore(String subject) {
        /* read */ return scoresMap.get(subject).first();
    }
}
