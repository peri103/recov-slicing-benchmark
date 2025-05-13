import com.google.common.collect.ImmutableListMultimap;

public class Course {
    private ImmutableListMultimap.Builder<String, String> courseBuilder;

    public Course() {
        courseBuilder = ImmutableListMultimap.builder();
    }

    public void addStudent(Student student, String courseName) {
        /* write */ courseBuilder.put(courseName, student.getName());
    }

    public ImmutableListMultimap<String, String> buildCourses() {
        return courseBuilder.build();
    }
}
