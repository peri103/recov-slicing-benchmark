import java.util.concurrent.ArrayBlockingQueue;

public class DataProcessor {
    private ArrayBlockingQueue<Integer> dataQueue;

    public DataProcessor(int capacity) {
        dataQueue = new ArrayBlockingQueue<>(capacity);
    }

    public void processData(int data) throws InterruptedException {
        /* write */ dataQueue.put(data);
    }

    public int getProcessedData() throws InterruptedException {
        return dataQueue.take();
    }
}
