import java.util.HashSet;

public class StudentScores {
    private HashSet<Integer> scores = new HashSet<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public HashSet<Integer> getScores() {
        return scores;
    }
}
