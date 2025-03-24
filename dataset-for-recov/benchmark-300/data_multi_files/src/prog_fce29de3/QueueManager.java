import java.util.concurrent.ArrayBlockingQueue;

public class QueueManager {
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void writeToQueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readFromQueue() throws InterruptedException {
        return queue.take();
    }
}
