import java.util.Hashtable;

public class StudentScores {
    private Hashtable<String, Integer> scores = new Hashtable<>();

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public int getScore(String subject) {
        return scores.get(subject);
    }
}
