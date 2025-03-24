import java.util.concurrent.LinkedBlockingDeque;

public class DataAnalyzer {
    private LinkedBlockingDeque<Integer> dataQueue;

    public DataAnalyzer(LinkedBlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyzeData() {
        try {
            /* read */ int value = dataQueue.takeLast();
            return value;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
