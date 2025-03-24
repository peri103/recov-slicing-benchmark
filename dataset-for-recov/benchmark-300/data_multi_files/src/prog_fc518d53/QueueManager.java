import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueManager {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void putValue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int takeValue() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
