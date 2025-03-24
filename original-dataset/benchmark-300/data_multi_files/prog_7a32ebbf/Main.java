import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        DataConsumer consumer = new DataConsumer(processor.getQueue());

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to process data
        executor.submit(() -> {
            try {
                processor.processData(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Task to consume data
        executor.submit(() -> {
            try {
                consumer.consumeData();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Additional complexity: Adding more data processing tasks
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                try {
                    processor.processData(i * 10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Additional complexity: Adding more data consumption tasks
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                try {
                    consumer.consumeData();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}