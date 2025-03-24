import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readData() throws InterruptedException {
        /* read */ return queue.take();
    }
}
