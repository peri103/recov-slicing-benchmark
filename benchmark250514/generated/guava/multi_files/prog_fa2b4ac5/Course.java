import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import java.util.List;

public class Course {
    private String courseName;
    private ImmutableListMultimap<String, Integer> scores;

    public Course(String courseName) {
        this.courseName = courseName;
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        for (int i = 0; i < 5; i++) {
            builder.put("scores", i * 10);
        }
        this.scores = builder.build();
    }

    public List<Integer> getScores() {
        return scores.get("scores");
    }

    public String getCourseName() {
        return courseName;
    }
}
