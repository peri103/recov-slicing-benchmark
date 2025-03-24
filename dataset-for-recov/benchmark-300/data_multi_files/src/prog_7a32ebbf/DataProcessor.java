import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataProcessor {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void processData(int data) throws InterruptedException {
        /* write */ queue.put(data);
    }

    public BlockingQueue<Integer> getQueue() {
        return queue;
    }
}
