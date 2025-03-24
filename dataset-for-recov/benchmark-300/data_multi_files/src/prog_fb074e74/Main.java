import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Submit a task to process data
        Future<?> processFuture = executor.submit(() -> {
            try {
                processor.processData(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
            Thread.sleep(100);
        }

        // Submit a task to consume data
        Future<Integer> consumeFuture = executor.submit(() -> {
            try {
                return consumer.consumeData();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Ensure the process operation completes
        processFuture.get();

        // Get the result of the consume operation
        int value = consumeFuture.get();
        System.out.println("Consumed value: " + value);

        // Shutdown the executor
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}