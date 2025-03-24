import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeData(int data) throws InterruptedException {
        /* write */ queue.put(data);
    }

    public int readData() throws InterruptedException {
        return queue.take();
    }
}
