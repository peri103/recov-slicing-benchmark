import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataWriter {
    private BlockingQueue<Integer> queue;

    public DataWriter(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
        System.out.println("Data written: " + value);
    }
}
