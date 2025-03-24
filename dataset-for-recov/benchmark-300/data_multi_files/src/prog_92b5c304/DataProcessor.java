import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue;

    public DataProcessor(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData() {
        try {
            /* read */ int value = queue.take();
            System.out.println("Processed data: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
