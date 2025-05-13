import org.apache.commons.collections4.list.NodeCachingLinkedList;
import java.util.List;

public class StudentScores {
    private NodeCachingLinkedList<Integer> scores = new NodeCachingLinkedList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }
}
