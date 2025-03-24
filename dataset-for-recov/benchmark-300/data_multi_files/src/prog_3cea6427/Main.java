import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataWriter writer = new DataWriter(queue);
        DataProcessor processor = new DataProcessor(queue);

        // Submit tasks to the executor
        executor.submit(writer::writeData);
        executor.submit(processor::processData);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // Additional unrelated code to make the program more complex
        System.out.println("Starting additional operations...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Performing operation " + (i + 1));
        }
        System.out.println("Additional operations completed.");
    }
}