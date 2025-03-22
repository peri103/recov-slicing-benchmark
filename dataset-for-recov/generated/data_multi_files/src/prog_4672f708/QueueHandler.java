import java.util.concurrent.LinkedTransferQueue;

public class QueueHandler {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void addToQueue(int number) {
        try {
            /* write */ queue.put(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int retrieveFromQueue() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}