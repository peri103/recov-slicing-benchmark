import java.util.concurrent.ArrayBlockingQueue;

public class DataGenerator {
    private ArrayBlockingQueue<Integer> dataQueue;

    public DataGenerator(ArrayBlockingQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public void generateData() {
        try {
            /* write */ dataQueue.put(1);
            System.out.println("Data generated and added to queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
