import java.util.concurrent.CopyOnWriteArraySet;

public class Course {
    private String courseName;
    private CopyOnWriteArraySet<Integer> studentIds = new CopyOnWriteArraySet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(int studentId) {
        /* write */ studentIds.add(studentId);
    }

    public CopyOnWriteArraySet<Integer> getStudentIds() {
        return studentIds;
    }
}
