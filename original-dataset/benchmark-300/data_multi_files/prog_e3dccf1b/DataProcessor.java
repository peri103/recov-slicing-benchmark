import java.util.concurrent.LinkedBlockingQueue;

public class DataProcessor {
    private LinkedBlockingQueue<Integer> dataQueue = new LinkedBlockingQueue<>();

    public void processData(int data) throws InterruptedException {
        /* write */ dataQueue.put(data);
    }

    public int getProcessedData() throws InterruptedException {
        return dataQueue.take();
    }
}
