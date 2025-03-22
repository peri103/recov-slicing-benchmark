import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void addToQueue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public LinkedBlockingQueue<Integer> getQueue() {
        return queue;
    }
}
