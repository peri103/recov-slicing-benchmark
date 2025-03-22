import java.util.ArrayList;

public class StudentScores {
    private ArrayList<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }
}
