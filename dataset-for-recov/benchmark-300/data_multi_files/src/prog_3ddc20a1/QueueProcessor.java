import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueProcessor {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void addToQueue(int value) throws InterruptedException {
        queue.put(value);
    }

    public void processQueue() {
        while (!queue.isEmpty()) {
            try {
                int element = queue.take();
                System.out.println("Processed element: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
