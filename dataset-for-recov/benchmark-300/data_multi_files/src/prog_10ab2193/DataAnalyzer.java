import java.util.concurrent.LinkedTransferQueue;

public class DataAnalyzer {
    private LinkedTransferQueue<Integer> queue;

    public DataAnalyzer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public int analyzeData() {
        /* read */ Integer value = queue.poll();
        return value != null ? value : -1;
    }
}
