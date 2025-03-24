import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readValue() throws InterruptedException {
        /* read */ return queue.take();
    }
}
