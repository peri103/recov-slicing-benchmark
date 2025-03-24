import java.util.concurrent.SynchronousQueue;

public class QueueManager {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void putValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int takeValue() throws InterruptedException {
        return queue.take();
    }
}
