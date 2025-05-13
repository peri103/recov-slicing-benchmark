import java.util.ArrayList;

public class StudentScores {
    private ArrayList<Integer> scores;

    public StudentScores() {
        scores = new ArrayList<>();
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public int getScore(int index) {
        return scores.get(index);
    }
}
