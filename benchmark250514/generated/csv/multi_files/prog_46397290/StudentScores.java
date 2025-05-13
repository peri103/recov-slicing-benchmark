import java.util.ArrayList;
import java.util.List;

public class StudentScores {
    private List<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public int getFirstScore() {
        /* read */ return scores.get(0);
    }
}
