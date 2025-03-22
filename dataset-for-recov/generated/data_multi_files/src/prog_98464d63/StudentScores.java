import java.util.TreeMap;

public class StudentScores {
    private TreeMap<String, Integer> scores = new TreeMap<>();
    private int index = 0;

    public void addScore(int score) {
        /* write */ scores.put("score" + index, score);
        index++;
    }

    public int getScore(int index) {
        return scores.get("score" + index);
    }
}
