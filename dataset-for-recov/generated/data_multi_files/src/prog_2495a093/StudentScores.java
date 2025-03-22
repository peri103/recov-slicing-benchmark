import java.util.concurrent.CopyOnWriteArrayList;

public class StudentScores {
    private CopyOnWriteArrayList<Integer> scores = new CopyOnWriteArrayList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public CopyOnWriteArrayList<Integer> getScores() {
        return scores;
    }
}
