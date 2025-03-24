import java.util.concurrent.SynchronousQueue;

public class QueueManager {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeValue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int readValue() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1; // Return -1 in case of error
        }
    }
}
