import java.util.Deque;
import java.util.LinkedList;

public class StudentScores {
    private Deque<Integer> scores = new LinkedList<>();

    public void addScore(int score) {
        /* write */ scores.addLast(score);
    }

    public Deque<Integer> getScores() {
        return scores;
    }
}
