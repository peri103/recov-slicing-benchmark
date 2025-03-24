import java.util.concurrent.SynchronousQueue;

public class QueueWriter {
    private SynchronousQueue<Integer> queue;

    public QueueWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }
}
