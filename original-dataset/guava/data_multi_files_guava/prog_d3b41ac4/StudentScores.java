import java.util.ArrayList;
import java.util.List;

public class StudentScores {
    private ArrayList<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }
}
