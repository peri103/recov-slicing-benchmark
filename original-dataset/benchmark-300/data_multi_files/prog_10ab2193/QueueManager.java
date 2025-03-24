import java.util.concurrent.LinkedTransferQueue;

public class QueueManager {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void offerValue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer pollValue() {
        return queue.poll();
    }
}
