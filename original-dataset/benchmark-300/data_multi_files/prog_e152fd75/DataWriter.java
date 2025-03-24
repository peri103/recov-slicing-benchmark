import java.util.concurrent.SynchronousQueue;

public class DataWriter {
    private SynchronousQueue<Integer> queue;

    public DataWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) {
        try {
            /* write */ queue.put(value);
            System.out.println("Value " + value + " has been written to the queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
