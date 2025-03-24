import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataProcessor {
    private BlockingQueue<Integer> dataQueue = new ArrayBlockingQueue<>(10);

    public void processData(int data) throws InterruptedException {
        /* write */ dataQueue.put(data);
    }

    public BlockingQueue<Integer> getDataQueue() {
        return dataQueue;
    }
}
