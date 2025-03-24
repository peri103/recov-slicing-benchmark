import java.util.concurrent.CopyOnWriteArraySet;

public class Course {
    private String courseName;
    private CopyOnWriteArraySet<Student> enrolledStudents = new CopyOnWriteArraySet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollCourse(courseName);
    }

    public CopyOnWriteArraySet<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
