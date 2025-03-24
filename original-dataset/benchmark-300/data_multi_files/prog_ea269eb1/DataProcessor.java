import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataProcessor {
    private BlockingQueue<Integer> queue;

    public DataProcessor(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData() {
        try {
            /* read */ int value = queue.take();
            System.out.println("Processed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
