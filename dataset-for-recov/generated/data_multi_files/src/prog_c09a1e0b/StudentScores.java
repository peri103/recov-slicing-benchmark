import java.util.TreeSet;

public class StudentScores {
    private TreeSet<Integer> scores;

    public StudentScores() {
        this.scores = new TreeSet<>();
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public boolean hasScore(int score) {
        /* read */ return scores.contains(score);
    }
}
