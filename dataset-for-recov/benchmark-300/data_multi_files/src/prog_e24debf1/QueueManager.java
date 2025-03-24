import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void writeToQueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readFromQueue() throws InterruptedException {
        /* read */ return queue.take();
    }
}
