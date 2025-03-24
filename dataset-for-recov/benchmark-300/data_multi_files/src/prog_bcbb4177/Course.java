import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Course {
    private BlockingDeque<Student> studentQueue = new LinkedBlockingDeque<>();

    public void enrollStudent(Student student) {
        /* write */ studentQueue.addFirst(student);
    }

    public BlockingDeque<Student> getStudentQueue() {
        return studentQueue;
    }
}
