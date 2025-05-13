import com.google.common.collect.ImmutableSet;
import java.util.HashSet;

public class Course {
    private String courseName;
    private HashSet<String> enrolledStudents = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    public ImmutableSet<String> getEnrolledStudents() {
        return ImmutableSet.copyOf(enrolledStudents);
    }

    public String getCourseName() {
        return courseName;
    }
}
