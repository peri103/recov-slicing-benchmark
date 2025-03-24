import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataProcessor {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void processData(int data) {
        try {
            /* write */ queue.put(data);
            System.out.println("Data " + data + " processed and written to the queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BlockingQueue<Integer> getQueue() {
        return queue;
    }
}
