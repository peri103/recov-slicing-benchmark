import com.google.common.collect.ImmutableMap;

public class Course {
    private ImmutableMap.Builder<String, String> gradesBuilder;

    public Course() {
        this.gradesBuilder = ImmutableMap.builder();
    }

    public void addGrade(String subject, String grade) {
        /* write */ gradesBuilder.put(subject, grade);
    }

    public ImmutableMap<String, String> getGrades() {
        return gradesBuilder.build();
    }
}
