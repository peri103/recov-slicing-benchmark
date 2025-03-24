import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
