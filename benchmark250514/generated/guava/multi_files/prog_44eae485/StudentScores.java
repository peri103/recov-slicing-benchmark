import com.google.common.collect.ImmutableSortedSet;

public class StudentScores {
    private ImmutableSortedSet.Builder<Integer> scoreBuilder = ImmutableSortedSet.naturalOrder();
    private ImmutableSortedSet<Integer> scores;

    public void addScore(int score) {
        /* write */ scoreBuilder.add(score);
        scores = scoreBuilder.build();
    }

    public boolean containsScore(int score) {
        /* read */ return scores.contains(score);
    }
}