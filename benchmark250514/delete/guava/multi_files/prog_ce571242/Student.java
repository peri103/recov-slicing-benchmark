import com.google.common.collect.ImmutableMap;

public class Student {
    private String name;
    private ImmutableMap.Builder<String, Integer> scoresBuilder = ImmutableMap.builder();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scoresBuilder.put(subject, score);
    }

    public ImmutableMap<String, Integer> getScores() {
        return scoresBuilder.build();
    }

    public String getName() {
        return name;
    }
}
