import com.google.common.collect.MinMaxPriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class StudentScores {
    private MinMaxPriorityQueue<Integer> scoresQueue;

    public StudentScores() {
        this.scoresQueue = MinMaxPriorityQueue.create();
    }

    public void addScore(int score) {
        /* write */ scoresQueue.add(score);
    }

    public List<Integer> getScores() {
        List<Integer> scoresList = new ArrayList<>();
        while (!scoresQueue.isEmpty()) {
            scoresList.add(scoresQueue.poll());
        }
        return scoresList;
    }

    public Integer getTopScore() {
        /* read */ return scoresQueue.peek();
    }
}
