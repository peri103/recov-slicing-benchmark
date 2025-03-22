import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class StudentScores {
    private Hashtable<String, Integer> scoresTable = new Hashtable<>();
    private ArrayList<Integer> scoresList = new ArrayList<>();

    public void addScore(int score) {
        /* write */ scoresTable.put("latestScore", score);
        scoresList.add(score);
    }

    public List<Integer> getScores() {
        return scoresList;
    }

    public int getLatestScore() {
        /* read */ return scoresTable.get("latestScore");
    }
}
