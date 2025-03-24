import java.util.concurrent.LinkedTransferQueue;

public class DataGenerator {
    private LinkedTransferQueue<Integer> queue;

    public DataGenerator(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateData() {
        /* write */ queue.offer(42);
        System.out.println("Generated value: 42");
    }
}
