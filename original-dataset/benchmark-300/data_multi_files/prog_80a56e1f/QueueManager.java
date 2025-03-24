import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void addToQueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int takeFromQueue() throws InterruptedException {
        return queue.take();
    }
}
