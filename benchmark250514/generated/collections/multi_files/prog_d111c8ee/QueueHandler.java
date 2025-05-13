import org.apache.commons.collections4.queue.CircularFifoQueue;

public class QueueHandler {
    private CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(10);

    public void addToQueue(int value) {
        /* write */ queue.add(value);
    }

    public Integer peekQueue() {
        return queue.peek();
    }

    public Integer pollQueue() {
        return queue.poll();
    }

    public boolean isQueueEmpty() {
        return queue.isEmpty();
    }
}
