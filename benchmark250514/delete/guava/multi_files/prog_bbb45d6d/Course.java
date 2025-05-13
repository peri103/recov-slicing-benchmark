import com.google.common.collect.ImmutableList;

public class Course {
    private String courseName;
    private ImmutableList.Builder<Integer> gradesBuilder = ImmutableList.builder();
    private ImmutableList<Integer> grades;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(int grade) {
        /* write */ gradesBuilder.add(grade);
    }

    public void finalizeGrades() {
        grades = gradesBuilder.build();
    }

    public int getGrade(int index) {
        return grades.get(index);
    }
}
