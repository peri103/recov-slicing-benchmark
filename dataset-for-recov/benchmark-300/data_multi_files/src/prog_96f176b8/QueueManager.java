import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readValue() throws InterruptedException {
        return queue.take();
    }
}
