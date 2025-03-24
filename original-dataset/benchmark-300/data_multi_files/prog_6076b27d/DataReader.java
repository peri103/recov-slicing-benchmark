import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataReader {
    private BlockingQueue<Integer> queue;

    public DataReader(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() throws InterruptedException {
        /* read */ return queue.take();
    }
}
