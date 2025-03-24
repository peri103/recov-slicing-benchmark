import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue;

    public DataProcessor(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData(int data) {
        try {
            /* write */ queue.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
