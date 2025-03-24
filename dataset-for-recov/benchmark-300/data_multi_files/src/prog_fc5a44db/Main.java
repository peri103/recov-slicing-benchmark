import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Thread to write data
        executor.submit(() -> {
            int randomValue = random.nextInt(100);
            System.out.println("Generated value: " + randomValue);
            processor.processData(randomValue);
        });

        // Thread to read data
        executor.submit(() -> {
            try {
                Thread.sleep(1000); // Simulate some delay
                consumer.consumeData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}