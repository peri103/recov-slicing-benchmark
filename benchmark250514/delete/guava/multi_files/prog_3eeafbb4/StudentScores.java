import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class StudentScores {
    private Builder<Integer> scoreBuilder = ImmutableList.builder();

    public void addScore(int score) {
        /* write */ scoreBuilder.add(score);
    }

    public ImmutableList<Integer> buildScores() {
        return scoreBuilder.build();
    }
}
