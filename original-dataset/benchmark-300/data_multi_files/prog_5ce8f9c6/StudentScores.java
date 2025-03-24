import java.util.Vector;

public class StudentScores {
    private Vector<Integer> scores = new Vector<>();

    public void addScore(int score) {
        /* write */ scores.addElement(score);
    }

    public Vector<Integer> getScores() {
        return scores;
    }
}
