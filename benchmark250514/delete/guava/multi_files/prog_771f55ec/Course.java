import com.google.common.collect.ImmutableListMultimap;

public class Course {
    private String courseName;
    private ImmutableListMultimap.Builder<String, String> builder;

    public Course(String courseName) {
        this.courseName = courseName;
        this.builder = ImmutableListMultimap.builder();
    }

    public void addStudent(String studentName) {
        /* write */ builder.put("students", studentName);
    }

    public ImmutableListMultimap<String, String> getStudentList() {
        return builder.build();
    }

    public String getCourseName() {
        return courseName;
    }
}
