import java.util.concurrent.PriorityBlockingQueue;

public class DataAnalyzer {
    private PriorityBlockingQueue<Integer> queue;

    public DataAnalyzer(PriorityBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int analyze() {
        /* read */ Integer value = queue.poll();
        return value != null ? value : -1;
    }
}
