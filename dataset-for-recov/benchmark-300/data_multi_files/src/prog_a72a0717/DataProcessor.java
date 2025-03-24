import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue;

    public DataProcessor(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData() throws InterruptedException {
        /* write */ queue.put(42);
    }
}
