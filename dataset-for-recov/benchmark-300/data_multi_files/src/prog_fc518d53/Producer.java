import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1); // Simulate some delay
            /* write */ queue.put(42);
            System.out.println("Produced: 42");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
