import java.util.PriorityQueue;

public class NumberProcessor {
    private PriorityQueue<Integer> queue;

    public NumberProcessor(PriorityQueue<Integer> queue) {
        this.queue = queue;
    }

    public int getSmallestNumber() {
        /* read */ return queue.peek();
    }
}
