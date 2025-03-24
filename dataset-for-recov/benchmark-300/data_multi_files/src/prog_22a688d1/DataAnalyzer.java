import java.util.concurrent.BlockingQueue;

public class DataAnalyzer {
    private BlockingQueue<Integer> dataQueue;

    public DataAnalyzer(BlockingQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyzeData() throws InterruptedException {
        /* read */ int data = dataQueue.take();
        return data;
    }
}
