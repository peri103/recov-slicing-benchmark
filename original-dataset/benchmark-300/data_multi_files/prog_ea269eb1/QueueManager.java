import java.util.concurrent.ArrayBlockingQueue;

public class QueueManager {
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void addToQueue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int takeFromQueue() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1; // Return -1 in case of interruption
        }
    }
}
