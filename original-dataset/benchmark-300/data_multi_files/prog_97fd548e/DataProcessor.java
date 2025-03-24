import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void processData(int data) {
        try {
            /* write */ queue.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public SynchronousQueue<Integer> getQueue() {
        return queue;
    }
}
