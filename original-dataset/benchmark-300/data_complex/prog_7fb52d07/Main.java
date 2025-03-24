import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Create a thread to perform the write operation
        executor.submit(() -> {
            try {
                int valueToWrite = random.nextInt(100);
                System.out.println("Generated value to write: " + valueToWrite);
                /* write */ queue.put(valueToWrite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to perform the read operation
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor after tasks are completed
        executor.shutdown();
    }
}