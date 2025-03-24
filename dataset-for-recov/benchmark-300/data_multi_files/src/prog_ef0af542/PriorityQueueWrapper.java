import java.util.PriorityQueue;

public class PriorityQueueWrapper {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addElement(int element) {
        /* write */ queue.offer(element);
    }

    public Integer peekElement() {
        return queue.peek();
    }
}
