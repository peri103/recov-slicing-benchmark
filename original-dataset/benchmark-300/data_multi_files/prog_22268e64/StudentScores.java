import java.util.LinkedList;

public class StudentScores {
    private LinkedList<Integer> scores = new LinkedList<>();

    public void addScore(int score) {
        /* write */ scores.addFirst(score);
    }

    public LinkedList<Integer> getScores() {
        return scores;
    }
}
