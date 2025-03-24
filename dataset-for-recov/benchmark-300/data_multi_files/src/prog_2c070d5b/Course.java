import java.util.HashSet;

public class Course {
    private String courseName;
    private HashSet<Student> enrolledStudents = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public HashSet<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
