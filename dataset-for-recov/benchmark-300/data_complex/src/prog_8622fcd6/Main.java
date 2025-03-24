import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Create a separate thread to perform the write operation
        executor.submit(() -> {
            try {
                int valueToWrite = random.nextInt(100);
                System.out.println("Generated value to write: " + valueToWrite);
                /* write */ queue.put(valueToWrite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Simulate some unrelated computation
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += random.nextInt(10);
        }
        System.out.println("Unrelated computation result: " + sum);

        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value read from the queue: " + value);

        // Shutdown the executor service
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        // Additional unrelated code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor.submit(() -> {
            try {
                stringQueue.put("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        String message = stringQueue.take();
        System.out.println("Message from another queue: " + message);
    }
}