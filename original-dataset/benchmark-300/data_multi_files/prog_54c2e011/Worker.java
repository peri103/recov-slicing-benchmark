import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Worker {
    private DequeManager dequeManager;

    public Worker(DequeManager dequeManager) {
        this.dequeManager = dequeManager;
    }

    public void startWork() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to add elements to the deque
        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    dequeManager.addValue(i * 10);
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Submit a task to take elements from the deque
        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    int value = dequeManager.takeValue();
                    System.out.println("Taken: " + value);
                    TimeUnit.MILLISECONDS.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}
