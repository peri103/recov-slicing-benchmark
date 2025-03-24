import java.util.LinkedList;

public class StudentScores {
    private LinkedList<Integer> scores = new LinkedList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public LinkedList<Integer> getScores() {
        return scores;
    }
}
