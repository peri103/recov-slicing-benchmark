import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue;

    public DataProcessor(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData() {
        try {
            /* write */ queue.put(42);
            System.out.println("Value 42 written to the queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
