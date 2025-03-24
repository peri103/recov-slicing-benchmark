import java.util.concurrent.SynchronousQueue;

public class DataWriter {
    private SynchronousQueue<Integer> queue;

    public DataWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData() {
        try {
            /* write */ queue.put(42);
            System.out.println("Data 42 written to the queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
