import java.util.concurrent.SynchronousQueue;
import java.util.Random;

public class DataGenerator {
    private SynchronousQueue<Integer> queue;
    private Random random;

    public DataGenerator(SynchronousQueue<Integer> queue) {
        this.queue = queue;
        this.random = new Random();
    }

    public void generateData() {
        try {
            int value = random.nextInt(100);
            /* write */ queue.put(value);
            System.out.println("Generated data: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
