import java.util.concurrent.SynchronousQueue;

public class QueueManager {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeValue(int value) {
        try {
            /* write */ queue.put(value);
            System.out.println("Value written to the queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int readValue() {
        try {
            /* read */ int value = queue.take();
            System.out.println("Value read from the queue: " + value);
            return value;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
