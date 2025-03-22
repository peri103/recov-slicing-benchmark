import java.util.concurrent.SynchronousQueue;

public class DataReader {
    private SynchronousQueue<Integer> queue;

    public DataReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void readData() {
        try {
            /* read */ int value = queue.take();
            System.out.println("SynchronousQueue value: " + value);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
