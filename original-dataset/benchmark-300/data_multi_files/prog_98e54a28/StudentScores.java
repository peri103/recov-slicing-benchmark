import java.util.TreeSet;

public class StudentScores {
    private TreeSet<Integer> scores = new TreeSet<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public TreeSet<Integer> getScores() {
        return scores;
    }
}
