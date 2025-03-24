import java.util.concurrent.BlockingQueue;

public class DataGenerator {
    private BlockingQueue<Integer> queue;

    public DataGenerator(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateData() {
        try {
            /* write */ queue.put(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
