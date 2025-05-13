import com.google.common.collect.ImmutableList;

public class StudentScores {
    private ImmutableList.Builder<Integer> scoresBuilder = ImmutableList.builder();

    public void addScore(int score) {
        /* write */ scoresBuilder.add(score);
    }

    public ImmutableList<Integer> buildScores() {
        return scoresBuilder.build();
    }
}
