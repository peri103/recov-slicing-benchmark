import java.util.PriorityQueue;

public class StudentScores {
    private PriorityQueue<Integer> scores = new PriorityQueue<>();

    public void addScore(int score) {
        /* write */ scores.offer(score);
    }

    public PriorityQueue<Integer> getScores() {
        return scores;
    }
}
