import com.google.common.collect.ImmutableMultimap;

public class Course {
    private ImmutableMultimap.Builder<String, Integer> gradesBuilder = ImmutableMultimap.builder();

    public void addGrade(String studentName, int grade) {
        /* write */ gradesBuilder.put(studentName, grade);
    }

    public ImmutableMultimap<String, Integer> buildGrades() {
        return gradesBuilder.build();
    }
}
