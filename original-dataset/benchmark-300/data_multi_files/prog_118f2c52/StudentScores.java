import java.util.Deque;
import java.util.ArrayDeque;

public class StudentScores {
    private Deque<Integer> scores = new ArrayDeque<>();

    public void addScore(int score) {
        /* write */ scores.addLast(score);
    }

    public int getLastScore() {
        /* read */ return scores.getLast();
    }
}
