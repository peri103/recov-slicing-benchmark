import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class StudentScores {
    private ImmutableClassToInstanceMap<Object> scoreMap;

    public StudentScores() {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ scoreMap = builder.put(Integer.class, 95).build(); // Initial score
    }

    public Integer getInitialScore() {
        /* read */ return scoreMap.getInstance(Integer.class);
    }
}
