import java.util.Deque;
import java.util.LinkedList;

public class Course {
    private String courseName;
    private Deque<Student> students = new LinkedList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.addLast(student);
    }

    public Deque<Student> getStudents() {
        return students;
    }
}
