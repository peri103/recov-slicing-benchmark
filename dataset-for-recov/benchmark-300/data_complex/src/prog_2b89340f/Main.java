import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write to the deque
        executor.submit(() -> {
            try {
                /* write */ deque.addFirst(42);
                System.out.println("Value 42 added to the deque.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Task to read from the deque
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                /* read */ int value = deque.takeFirst();
                System.out.println("Value " + value + " taken from the deque.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);

        // Additional unrelated code to make the program more complex
        LinkedBlockingDeque<String> stringDeque = new LinkedBlockingDeque<>();
        stringDeque.addLast("Hello");
        stringDeque.addLast("World");

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