import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Start a new thread to perform the write operation
        executor.submit(() -> {
            writer.writeData(42); // Write the value 42 to the queue
        });

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
        }

        // Start a new thread to perform the read operation
        executor.submit(() -> {
            int value = reader.readData(); // Read the value from the queue
            System.out.println("Read value: " + value); // Print the read value
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform more unrelated operations
        System.out.println("All tasks completed.");
    }
}