import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void writeToQueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readFromQueue() throws InterruptedException {
        return queue.take();
    }
}
