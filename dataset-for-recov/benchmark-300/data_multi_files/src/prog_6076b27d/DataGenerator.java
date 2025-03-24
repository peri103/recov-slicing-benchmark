import java.util.concurrent.LinkedBlockingQueue;

public class DataGenerator {
    private LinkedBlockingQueue<Integer> dataQueue;

    public DataGenerator(LinkedBlockingQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public void generateData() {
        try {
            /* write */ dataQueue.put(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
