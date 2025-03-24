import java.util.concurrent.LinkedBlockingQueue;

public class DataProcessor {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void processData(int data) throws InterruptedException {
        /* write */ queue.put(data);
    }

    public int getProcessedData() throws InterruptedException {
        return queue.take();
    }
}
