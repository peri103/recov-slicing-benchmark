import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Start a new thread to perform the write operation
        executor.submit(() -> {
            int valueToWrite = random.nextInt(100);
            writer.writeData(valueToWrite);
        });

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated operation " + i);
        }

        // Start a new thread to perform the read operation
        executor.submit(() -> {
            int value = reader.readData();
        });

        // Shutdown the executor service
        executor.shutdown();
    }
}