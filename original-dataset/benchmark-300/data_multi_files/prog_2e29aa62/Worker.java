import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class Worker {
    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
    private Random random = new Random();

    public void generateData() {
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            blockingQueue.offer(num);
            System.out.println("Generated data: " + num);
        }
    }

    public void processGeneratedData() throws InterruptedException {
        while (!blockingQueue.isEmpty()) {
            int num = blockingQueue.take();
            System.out.println("Processed data: " + num);
        }
    }
}
