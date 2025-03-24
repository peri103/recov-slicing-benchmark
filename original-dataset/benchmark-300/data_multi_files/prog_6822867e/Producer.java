import java.util.concurrent.BlockingQueue;
import java.util.Random;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private Random random;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            int num = random.nextInt(100);
            /* write */ queue.put(num);
            System.out.println("Produced: " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
