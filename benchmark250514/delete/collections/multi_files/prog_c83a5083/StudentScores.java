import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class StudentScores {
    private AbstractReferenceMap<String, Integer> scoresMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);

    public void addScore(String subject, int score) {
        /* write */ scoresMap.put(subject, score);
    }

    public Integer getScore(String subject) {
        return scoresMap.get(subject);
    }
}
