import java.util.concurrent.SynchronousQueue;

public class QueueManager {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readValue() throws InterruptedException {
        return queue.take();
    }
}
