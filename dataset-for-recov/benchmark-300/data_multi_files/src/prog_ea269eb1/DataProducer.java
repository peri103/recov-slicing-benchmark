import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataProducer {
    private BlockingQueue<Integer> queue;

    public DataProducer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produceData() {
        try {
            /* write */ queue.put(42);
            System.out.println("Produced value: 42");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
