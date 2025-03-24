import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class DataProcessor {
    private BlockingQueue<Integer> queue;

    public DataProcessor() {
        this.queue = new ArrayBlockingQueue<>(10);
    }

    public void processData(int data) throws InterruptedException {
        /* write */ queue.put(data);
    }

    public BlockingQueue<Integer> getQueue() {
        return queue;
    }
}
