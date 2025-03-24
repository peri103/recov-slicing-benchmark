import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Course {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void enrollStudent(int studentId) throws InterruptedException {
        /* write */ queue.put(studentId);
    }

    public int getNextStudent() throws InterruptedException {
        return queue.take();
    }
}
