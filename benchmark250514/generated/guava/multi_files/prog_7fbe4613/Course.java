import com.google.common.collect.ImmutableSortedSet;

public class Course {
    private String courseName;
    private ImmutableSortedSet.Builder<Integer> studentIdsBuilder = ImmutableSortedSet.naturalOrder();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(int studentId) {
        /* write */ studentIdsBuilder.add(studentId);
    }

    public ImmutableSortedSet<Integer> getEnrolledStudentIds() {
        return studentIdsBuilder.build();
    }

    public String getCourseName() {
        return courseName;
    }
}
