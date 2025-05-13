import com.google.common.collect.ImmutableBiMap;

public class Course {
    private String courseName;
    private ImmutableBiMap.Builder<String, Integer> studentScoresBuilder;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScoresBuilder = ImmutableBiMap.builder();
    }

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScoresBuilder.put(studentName, score);
    }

    public ImmutableBiMap<String, Integer> getStudentScores() {
        return studentScoresBuilder.build();
    }

    public String getCourseName() {
        return courseName;
    }
}
