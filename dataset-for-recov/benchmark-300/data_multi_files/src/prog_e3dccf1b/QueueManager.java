import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void enqueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int dequeue() throws InterruptedException {
        return queue.take();
    }
}
