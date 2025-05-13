import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class StudentScores {
    private Builder<Integer> scoreBuilder = ImmutableSet.builder();

    public void addScore(int score) {
        /* write */ scoreBuilder.add(score);
    }

    public ImmutableSet<Integer> getScores() {
        return scoreBuilder.build();
    }
}
