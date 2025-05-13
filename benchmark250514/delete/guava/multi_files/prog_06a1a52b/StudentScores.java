import com.google.common.collect.HashBiMap;

public class StudentScores {
    private HashBiMap<String, Integer> scores = HashBiMap.create();

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public Integer getScore(String subject) {
        return scores.get(subject);
    }
}
