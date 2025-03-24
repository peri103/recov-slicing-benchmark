import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void processStudents() {
        for (Student student : students) {
            student.addRandomData();
        }
    }
}
