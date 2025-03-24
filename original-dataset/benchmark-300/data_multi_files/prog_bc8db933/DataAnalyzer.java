import java.util.concurrent.ConcurrentLinkedDeque;

public class DataAnalyzer {
    private ConcurrentLinkedDeque<Integer> dataQueue;

    public DataAnalyzer(ConcurrentLinkedDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyzeData() {
        /* read */ Integer value = dataQueue.peekLast();
        return value != null ? value : -1;
    }
}
