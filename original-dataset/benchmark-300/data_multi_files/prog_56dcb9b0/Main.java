import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            writer.writeData(42);
        });

        // Adding some unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println("Executing task " + Thread.currentThread().getName());
            });
        }

        executor.submit(() -> {
            int value = reader.readData();
            System.out.println("Read value: " + value);
        });

        // Shutdown the executor and wait for all tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}