import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Course {
    private String courseName;
    private Builder<String, String, Integer> builder = ImmutableTable.builder();
    private ImmutableTable<String, String, Integer> scoresTable;

    public Course(String courseName) {
        this.courseName = courseName;
        // Initialize the scores table with a default value
        /* write */ builder.put("student1", "assignment1", 85);
    }

    public void addScore(String student, String assignment, int score) {
        builder.put(student, assignment, score);
    }

    public void finalizeScores() {
        scoresTable = builder.build();
    }

    public Integer getScore(String student, String assignment) {
        return scoresTable.get(student, assignment);
    }

    public String getCourseName() {
        return courseName;
    }
}
