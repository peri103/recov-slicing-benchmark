import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueReader {
    private SynchronousQueue<Integer> queue;

    public SynchronousQueueReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void readValue() {
        new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from the SynchronousQueue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Read operation interrupted.");
            }
        }).start();
    }
}
