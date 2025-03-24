import java.util.concurrent.ConcurrentLinkedDeque;

public class StudentScores {
    private ConcurrentLinkedDeque<Integer> scores = new ConcurrentLinkedDeque<>();

    public void addScore(int score) {
        /* write */ scores.addLast(score);
    }

    public Integer getLastScore() {
        return scores.peekLast();
    }
}
