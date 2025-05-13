import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import java.util.HashMap;

public class StudentScores {
    private AbstractOrderedBidiMapDecorator<Integer, Integer> scoreMap = new AbstractOrderedBidiMapDecorator<>(new HashMap<>());

    public void addScore(int score) {
        /* write */ scoreMap.put(scoreMap.size(), score);
    }

    public int getScore(int index) {
        /* read */ return scoreMap.get(index);
    }
}
