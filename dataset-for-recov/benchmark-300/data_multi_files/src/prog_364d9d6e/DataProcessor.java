import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeData(int data) {
        try {
            /* write */ queue.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int readData() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1; // Return -1 in case of error
        }
    }
}
