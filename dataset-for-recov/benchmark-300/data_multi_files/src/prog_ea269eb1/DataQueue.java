import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataQueue {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readData() throws InterruptedException {
        return queue.take();
    }
}
