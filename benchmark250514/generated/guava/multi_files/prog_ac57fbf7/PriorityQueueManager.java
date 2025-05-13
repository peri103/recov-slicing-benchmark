import com.google.common.collect.MinMaxPriorityQueue;

public class PriorityQueueManager {
    private MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();

    public void addValue(int value) {
        /* write */ queue.offer(value);
    }

    public MinMaxPriorityQueue<Integer> getQueue() {
        return queue;
    }
}
