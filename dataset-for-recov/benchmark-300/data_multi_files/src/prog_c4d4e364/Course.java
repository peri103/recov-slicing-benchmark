import java.util.List;

public class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}
