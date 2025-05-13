import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseName;
    private ForwardingSet<Integer> scores;

    public Course(String courseName) {
        this.courseName = courseName;
        Set<Integer> backingSet = new HashSet<>();
        this.scores = new ForwardingSet<Integer>() {
            @Override
            protected Set<Integer> delegate() {
                return backingSet;
            }
        };
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public boolean hasScore(int score) {
        return scores.contains(score);
    }
}
