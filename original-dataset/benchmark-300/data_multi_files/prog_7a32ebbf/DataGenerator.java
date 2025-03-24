import java.util.concurrent.BlockingQueue;

public class DataGenerator {
    private BlockingQueue<Integer> queue;

    public DataGenerator(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateData() throws InterruptedException {
        /* write */ queue.put(42);
    }
}
