import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private BlockingDeque<Integer> dataQueue = new LinkedBlockingDeque<>();

    public void addData(int data) {
        /* write */ dataQueue.addFirst(data);
        System.out.println("Data added to the queue: " + data);
    }

    public BlockingDeque<Integer> getDataQueue() {
        return dataQueue;
    }
}
