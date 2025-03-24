import java.util.concurrent.SynchronousQueue;

public class QueueReader {
    private SynchronousQueue<Integer> queue;

    public QueueReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readValue() throws InterruptedException {
        /* read */ return queue.take();
    }
}
