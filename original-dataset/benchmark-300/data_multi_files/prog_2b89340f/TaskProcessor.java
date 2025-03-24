import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskProcessor {
    private ExecutorService executor = Executors.newFixedThreadPool(2);

    public void processTasks(DequeManager dequeManager) {
        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                dequeManager.addLast(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
                dequeManager.addLast(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("Processed value: " + dequeManager.takeLast());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(400);
                System.out.println("Processed value: " + dequeManager.takeLast());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
    }
}
