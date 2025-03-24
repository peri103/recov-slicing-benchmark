import java.util.concurrent.SynchronousQueue;

public class Writer {
    private SynchronousQueue<Integer> queue;

    public Writer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) {
        try {
            /* write */ queue.put(value);
            System.out.println("Value written to queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
