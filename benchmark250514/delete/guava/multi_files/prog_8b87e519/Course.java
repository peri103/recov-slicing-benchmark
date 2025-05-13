import com.google.common.collect.ImmutableBiMap;

public class Course {
    private String name;
    private ImmutableBiMap.Builder<String, Integer> gradesBuilder;

    public Course(String name) {
        this.name = name;
        this.gradesBuilder = ImmutableBiMap.builder();
    }

    public void addGrade(String assignment, int score) {
        /* write */ gradesBuilder.put(assignment, score);
    }

    public ImmutableBiMap<String, Integer> getGrades() {
        return gradesBuilder.build();
    }

    public String getName() {
        return name;
    }
}
