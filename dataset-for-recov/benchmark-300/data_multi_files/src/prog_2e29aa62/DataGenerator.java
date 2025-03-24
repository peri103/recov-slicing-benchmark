import java.util.concurrent.LinkedTransferQueue;

public class DataGenerator {
    private LinkedTransferQueue<Integer> queue;

    public DataGenerator(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateData() {
        /* write */ queue.put(42);
        System.out.println("Data generated and written to queue.");
    }
}
