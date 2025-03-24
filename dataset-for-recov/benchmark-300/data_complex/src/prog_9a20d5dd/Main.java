import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write to the deque
        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Simulate some delay
                /* write */ deque.addFirst(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Task to read from the deque
        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000); // Simulate some delay
                /* read */ int value = deque.takeFirst();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);

        // Additional unrelated code to make the program more complex
        BlockingDeque<String> stringDeque = new LinkedBlockingDeque<>();
        stringDeque.addFirst("Hello");
        stringDeque.addFirst("World");
        System.out.println("String Deque contents:");
        while (!stringDeque.isEmpty()) {
            System.out.println(stringDeque.takeFirst());
        }

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}