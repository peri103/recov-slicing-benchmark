import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueueManager {
    private ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

    public void addToQueue(String value) {
        try {
            queue.offer(value, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ArrayBlockingQueue<String> getQueue() {
        return queue;
    }
}
