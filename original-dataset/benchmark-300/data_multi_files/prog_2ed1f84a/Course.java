import java.util.concurrent.ConcurrentLinkedQueue;

public class Course {
    private ConcurrentLinkedQueue<Integer> studentIds = new ConcurrentLinkedQueue<>();

    public void enrollStudent(int studentId) {
        /* write */ studentIds.offer(studentId);
    }

    public ConcurrentLinkedQueue<Integer> getStudentIds() {
        return studentIds;
    }
}
