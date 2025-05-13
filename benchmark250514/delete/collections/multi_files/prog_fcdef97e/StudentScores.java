import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class StudentScores {
    private AbstractOrderedBidiMapDecorator<String, Integer> scoreMap;

    public StudentScores() {
        DualHashBidiMap<String, Integer> bidiMap = new DualHashBidiMap<>();
        this.scoreMap = new AbstractOrderedBidiMapDecorator<>(bidiMap) {};
    }

    public void addScore(String subject, int score) {
        /* write */ scoreMap.put(subject, score);
    }

    public int getScore(String subject) {
        return scoreMap.get(subject);
    }

    public AbstractOrderedBidiMapDecorator<String, Integer> getScoreMap() {
        return scoreMap;
    }
}
