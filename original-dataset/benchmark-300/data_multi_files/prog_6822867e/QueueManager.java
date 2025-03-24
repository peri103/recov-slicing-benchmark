import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readValue() throws InterruptedException {
        /* read */ return queue.take();
    }
}
