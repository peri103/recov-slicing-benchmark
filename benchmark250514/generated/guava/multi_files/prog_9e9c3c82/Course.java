import com.google.common.collect.ImmutableSortedMap;

public class Course {
    private String courseName;
    private ImmutableSortedMap<String, Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        /* write */ this.grades = ImmutableSortedMap.of("Assignment1", 85);
    }

    public String getCourseName() {
        return courseName;
    }

    public ImmutableSortedMap<String, Integer> getGrades() {
        return grades;
    }
}
