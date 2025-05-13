import com.google.common.collect.LinkedListMultimap;

public class StudentScores {
    private LinkedListMultimap<String, Integer> scores = LinkedListMultimap.create();

    public void addScore(int score) {
        /* write */ scores.put("score", score);
    }

    public LinkedListMultimap<String, Integer> getScoresMap() {
        return scores;
    }
}
