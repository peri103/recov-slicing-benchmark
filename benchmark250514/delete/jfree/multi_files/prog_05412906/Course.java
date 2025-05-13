import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollCourse(this.name);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getName() {
        return name;
    }
}
