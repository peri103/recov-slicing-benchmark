import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Writer task
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written: 42");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Some unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
        }

        // Reader task
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}