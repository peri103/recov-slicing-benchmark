import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueReader {
    private SynchronousQueue<Integer> queue;

    public SynchronousQueueReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readValue() {
        try {
            /* read */ int value = queue.take();
            System.out.println("Value read from SynchronousQueue: " + value);
            return value;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return -1; // Return an error value
        }
    }
}
