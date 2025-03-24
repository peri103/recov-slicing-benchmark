import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataGenerator {
    private BlockingQueue<Integer> dataQueue;

    public DataGenerator(BlockingQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public void generateData() throws InterruptedException {
        /* write */ dataQueue.put(42);
        System.out.println("Data generated and added to queue.");
    }
}
