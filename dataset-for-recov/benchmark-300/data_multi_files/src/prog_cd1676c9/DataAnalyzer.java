import java.util.concurrent.LinkedBlockingDeque;

public class DataAnalyzer {
    private LinkedBlockingDeque<Integer> dataQueue;

    public DataAnalyzer(LinkedBlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyze() {
        try {
            /* read */ return dataQueue.takeFirst();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
