import java.util.LinkedList;
import java.util.Queue;

public class Course {
    private String courseName;
    private Queue<Integer> studentIds = new LinkedList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(int studentId) {
        studentIds.add(studentId);
    }

    public Queue<Integer> getStudentIds() {
        return studentIds;
    }
}
