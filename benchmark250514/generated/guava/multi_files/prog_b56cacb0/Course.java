import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Course {
    private String courseName;
    private ImmutableRangeMap.Builder<Integer, String> gradeBuilder = ImmutableRangeMap.builder();

    public Course(String courseName) {
        this.courseName = courseName;
        setupGrades();
    }

    private void setupGrades() {
        gradeBuilder.put(Range.closed(90, 100), "A");
        gradeBuilder.put(Range.closed(80, 89), "B");
        gradeBuilder.put(Range.closed(70, 79), "C");
        gradeBuilder.put(Range.closed(60, 69), "D");
        gradeBuilder.put(Range.closed(0, 59), "F");
    }

    public String getGrade(int score) {
        ImmutableRangeMap<Integer, String> gradeMap = gradeBuilder.build();
        return gradeMap.get(score);
    }

    public String getCourseName() {
        return courseName;
    }
}
