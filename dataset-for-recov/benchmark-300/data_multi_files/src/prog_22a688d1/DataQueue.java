import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataQueue {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void putData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int takeData() throws InterruptedException {
        return queue.take();
    }
}
