import java.util.concurrent.LinkedBlockingQueue;

public class DataAnalyzer {
    private LinkedBlockingQueue<Integer> dataQueue;

    public DataAnalyzer(LinkedBlockingQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyzeData() throws InterruptedException {
        /* read */ int data = dataQueue.take();
        return data * 2; // Example analysis: double the value
    }
}
