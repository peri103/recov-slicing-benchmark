import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write the value
        Runnable writerTask = () -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written: 42");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Task to read the value
        Runnable readerTask = () -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Submit tasks to the executor
        executor.submit(writerTask);
        executor.submit(readerTask);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // More complex operations
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}