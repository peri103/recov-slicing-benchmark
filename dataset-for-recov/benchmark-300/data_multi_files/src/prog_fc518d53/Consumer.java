import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2); // Simulate some delay
            /* read */ int value = queue.take();
            System.out.println("Consumed: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
