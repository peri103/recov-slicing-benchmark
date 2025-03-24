import java.util.concurrent.BlockingDeque;

public class DataAnalyzer {
    private BlockingDeque<Integer> dataQueue;

    public DataAnalyzer(BlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyzeData() throws InterruptedException {
        /* read */ int value = dataQueue.takeLast();
        return value;
    }
}
