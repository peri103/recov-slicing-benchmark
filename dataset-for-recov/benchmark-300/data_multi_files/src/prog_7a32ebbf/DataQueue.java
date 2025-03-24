import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataQueue {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readData() throws InterruptedException {
        /* read */ return queue.take();
    }
}
