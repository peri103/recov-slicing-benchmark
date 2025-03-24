import java.util.HashSet;

public class Course {
    private String courseName;
    private HashSet<String> enrolledStudents = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(String studentName) {
        /* write */ enrolledStudents.add(studentName);
    }

    public HashSet<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
