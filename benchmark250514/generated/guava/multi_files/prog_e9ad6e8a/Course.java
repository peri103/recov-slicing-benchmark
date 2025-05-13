import com.google.common.collect.ImmutableBiMap;

public class Course {
    private ImmutableBiMap.Builder<String, Integer> studentScoresBuilder = new ImmutableBiMap.Builder<>();

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScoresBuilder.put(studentName, score);
    }

    public ImmutableBiMap<String, Integer> buildStudentScores() {
        return studentScoresBuilder.build();
    }
}
