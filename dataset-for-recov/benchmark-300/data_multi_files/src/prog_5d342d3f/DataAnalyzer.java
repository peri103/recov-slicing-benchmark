import java.util.concurrent.LinkedBlockingQueue;

public class DataAnalyzer {
    private LinkedBlockingQueue<Integer> queue;

    public DataAnalyzer(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int analyzeData() throws InterruptedException {
        /* read */ int value = queue.take();
        return value;
    }
}
