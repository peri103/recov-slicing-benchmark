import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueHandler {
    private PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

    public void addNumber(int number) {
        /* write */ queue.offer(number);
    }

    public Integer retrieveNumber() {
        return queue.poll();
    }
}
