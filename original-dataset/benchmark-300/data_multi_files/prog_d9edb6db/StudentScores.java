import java.util.concurrent.ConcurrentSkipListSet;

public class StudentScores {
    private ConcurrentSkipListSet<Integer> scores = new ConcurrentSkipListSet<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public ConcurrentSkipListSet<Integer> getScores() {
        return scores;
    }
}
