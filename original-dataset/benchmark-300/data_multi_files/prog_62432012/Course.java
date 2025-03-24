import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseName;
    private Set<Student> enrolledStudents = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
