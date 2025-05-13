import com.google.common.collect.ImmutableMap;

public class StudentScores {
    private ImmutableMap<String, Integer> scores;

    public StudentScores() {
        // Initialize with an empty map
        scores = ImmutableMap.of();
    }

    public void addScore(String subject, int score) {
        // Add score to the map
        /* write */ scores = ImmutableMap.of(subject, score);
    }

    public boolean containsSubject(String subject) {
        // Check if the map contains the subject
        /* read */ return scores.containsKey(subject);
    }
}
