import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class DataGenerator {
    private LinkedBlockingQueue<Integer> queue;

    public DataGenerator(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateData() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        try {
            /* write */ queue.put(randomNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
