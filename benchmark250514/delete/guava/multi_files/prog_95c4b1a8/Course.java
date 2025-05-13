import com.google.common.collect.ImmutableList;

public class Course {
    private ImmutableList.Builder<Integer> gradesBuilder = ImmutableList.builder();

    public void addGrade(int grade) {
        /* write */ gradesBuilder.add(grade);
    }

    public ImmutableList<Integer> getGrades() {
        return gradesBuilder.build();
    }
}
