import org.apache.commons.collections4.map.LinkedMap;

public class StudentScores {
    private LinkedMap<String, Integer> scores = new LinkedMap<>();

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public LinkedMap<String, Integer> getScores() {
        return scores;
    }
}
