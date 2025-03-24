import java.util.concurrent.ConcurrentLinkedQueue;

public class DataAnalyzer {
    private ConcurrentLinkedQueue<Integer> dataQueue;

    public DataAnalyzer(ConcurrentLinkedQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyze() {
        /* read */ Integer data = dataQueue.poll();
        return data != null ? data : -1;
    }
}
