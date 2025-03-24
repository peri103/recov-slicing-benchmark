import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataGenerator generator = new DataGenerator(queue);
        DataProcessor processor = new DataProcessor(queue);

        // Submit tasks to the executor
        executor.submit(generator::generateData);
        executor.submit(processor::processData);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // Additional unrelated code to make the program more complex
        System.out.println("Performing some unrelated operations...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation " + i);
        }
    }
}