import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void addToQueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int takeFromQueue() throws InterruptedException {
        return queue.take();
    }
}
