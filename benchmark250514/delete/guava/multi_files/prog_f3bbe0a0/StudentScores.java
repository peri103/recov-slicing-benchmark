import com.google.common.collect.LinkedHashBiMap;

public class StudentScores {
    private LinkedHashBiMap<String, Integer> scores = LinkedHashBiMap.create();

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public Integer getScore(String subject) {
        /* read */ return scores.get(subject);
    }
}
