import java.util.concurrent.SynchronousQueue;
import java.util.Random;

public class DataWriter {
    private SynchronousQueue<Integer> queue;

    public DataWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData() {
        Random random = new Random();
        int valueToWrite = random.nextInt(100);
        try {
            /* write */ queue.put(valueToWrite);
            System.out.println("Wrote value: " + valueToWrite);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
