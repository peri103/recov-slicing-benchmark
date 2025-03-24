import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Submit tasks to the executor
        executor.submit(processor::processData);

        // Simulate some unrelated operations
        for (int i = 0; i < 3; i++) {
            executor.submit(() -> {
                try {
                    System.out.println("Performing unrelated task...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.submit(consumer::consumeData);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}