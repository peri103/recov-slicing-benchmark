import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to perform the write operation
        Future<?> writerFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to perform the read operation
        Future<Integer> readerFuture = executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                return value;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Wait for the read operation to complete and print the result
        try {
            int value = readerFuture.get();
            System.out.println(value);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor service
        executor.shutdown();

        // Additional unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Another unrelated code block
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}