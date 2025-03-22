import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueWriter {
    private SynchronousQueue<Integer> queue;

    public SynchronousQueueWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) {
        new Thread(() -> {
            try {
                /* write */ queue.put(value);
                System.out.println("Value written to the SynchronousQueue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Write operation interrupted.");
            }
        }).start();
    }
}
