import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueWriter {
    private SynchronousQueue<Integer> queue;

    public SynchronousQueueWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) {
        try {
            /* write */ queue.put(value);
            System.out.println("Value written to SynchronousQueue: " + value);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
