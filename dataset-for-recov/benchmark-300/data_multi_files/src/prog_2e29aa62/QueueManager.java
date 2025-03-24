import java.util.concurrent.LinkedTransferQueue;

public class QueueManager {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void writeValue(int value) {
        /* write */ queue.put(value);
    }

    public int readValue() throws InterruptedException {
        /* read */ return queue.take();
    }
}
