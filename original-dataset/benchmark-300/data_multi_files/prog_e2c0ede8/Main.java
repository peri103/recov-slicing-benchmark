import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Perform the write operation in a separate thread
        executor.submit(() -> processor.processData(42));

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
        }

        // Perform the read operation in the main thread
        int value = consumer.consumeData();
        System.out.println("Consumed value: " + value);

        executor.shutdown();
    }
}