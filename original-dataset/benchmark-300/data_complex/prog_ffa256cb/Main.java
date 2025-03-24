import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Write thread
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Read thread
        executor.submit(() -> {
            try {
                Thread.sleep(1000); // Simulate some delay
                /* read */ int value = queue.take();
                System.out.println("Value " + value + " has been read from the queue.");
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
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);

        // More unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}