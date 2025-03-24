import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        AtomicInteger counter = new AtomicInteger(0);

        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Thread to process data
        executor.submit(() -> {
            try {
                processor.processData();
                counter.incrementAndGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to consume data
        executor.submit(() -> {
            try {
                consumer.consumeData();
                counter.incrementAndGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Additional unrelated code to make the program more complex
        System.out.println("Counter value: " + counter.get());

        // Simulate some other operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
        }

        // Simulate a delay
        Thread.sleep(1000);

        // Final output
        System.out.println("Program completed.");
    }
}