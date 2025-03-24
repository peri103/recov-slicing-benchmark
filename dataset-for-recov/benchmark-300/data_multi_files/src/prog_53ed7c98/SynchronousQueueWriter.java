import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueWriter {
    private SynchronousQueue<Integer> queue;

    public SynchronousQueueWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
