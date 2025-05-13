import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(courseName);
    }

    public List<Student> getEnrolledStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}
