import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataReader {
    private BlockingQueue<Integer> queue;

    public DataReader(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Data read: " + value);
        return value;
    }
}
