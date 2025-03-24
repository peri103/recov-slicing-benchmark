import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueReader {
    private SynchronousQueue<Integer> queue;

    public SynchronousQueueReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readValue() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
