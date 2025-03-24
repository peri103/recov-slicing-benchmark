import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Start a new thread to perform the write operation
        executor.submit(() -> {
            try {
                int valueToWrite = random.nextInt(100);
                System.out.println("Writing value: " + valueToWrite);
                /* write */ queue.put(valueToWrite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated operation " + i);
        }

        // Start a new thread to perform the read operation
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor service
        executor.shutdown();
    }
}