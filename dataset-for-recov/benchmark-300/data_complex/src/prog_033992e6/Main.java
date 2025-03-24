import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Writing task
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reading task
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        System.out.println("Performing some unrelated operations...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation " + i);
        }
    }
}