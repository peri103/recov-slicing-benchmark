import com.google.common.collect.ImmutableList;

public class Course {
    private String courseName;
    private ImmutableList.Builder<Integer> gradesBuilder = ImmutableList.builder();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(int grade) {
        /* write */ gradesBuilder.add(grade);
    }

    public ImmutableList<Integer> getGrades() {
        return gradesBuilder.build();
    }
}
