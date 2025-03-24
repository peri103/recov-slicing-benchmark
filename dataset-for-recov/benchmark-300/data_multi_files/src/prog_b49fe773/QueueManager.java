import java.util.concurrent.SynchronousQueue;

public class QueueManager {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeToQueue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int readFromQueue() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
