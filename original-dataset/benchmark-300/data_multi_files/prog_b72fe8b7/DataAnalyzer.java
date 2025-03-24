import java.util.concurrent.ConcurrentLinkedDeque;

public class DataAnalyzer {
    private ConcurrentLinkedDeque<Integer> dataQueue;

    public DataAnalyzer(ConcurrentLinkedDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyze() {
        /* read */ Integer value = dataQueue.peekFirst();
        return value != null ? value : -1;
    }
}
