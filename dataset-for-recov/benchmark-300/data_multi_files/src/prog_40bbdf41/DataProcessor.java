import java.util.PriorityQueue;

public class DataProcessor {
    private QueueManager queueManager;

    public DataProcessor(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void processData() {
        PriorityQueue<Integer> queue = queueManager.getQueue();
        /* read */ Integer value = queue.poll();
        System.out.println("Processed value: " + value);
    }
}
