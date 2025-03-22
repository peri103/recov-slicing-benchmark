import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueHandler {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void addValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int getValue() throws InterruptedException {
        return queue.take();
    }
}
