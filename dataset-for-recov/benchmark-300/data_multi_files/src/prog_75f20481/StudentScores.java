import java.util.Stack;

public class StudentScores {
    private Stack<Integer> scores = new Stack<>();

    public void addScore(int score) {
        /* write */ scores.push(score);
    }

    public Stack<Integer> getScores() {
        return scores;
    }
}
