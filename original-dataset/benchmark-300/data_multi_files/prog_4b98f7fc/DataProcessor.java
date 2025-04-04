import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private BlockingDeque<Integer> dataQueue = new LinkedBlockingDeque<>();

    public void addData(int data) throws InterruptedException {
        /* write */ dataQueue.addLast(data);
    }

    public BlockingDeque<Integer> getDataQueue() {
        return dataQueue;
    }
}
