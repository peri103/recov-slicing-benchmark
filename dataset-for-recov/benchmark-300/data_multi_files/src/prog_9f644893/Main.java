import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueManager queueManager = new QueueManager();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Write task
        Future<?> writeFuture = executor.submit(() -> {
            String testData = "Hello, DelayQueue!";
            queueManager.addToQueue(testData, 1000); // Delay of 1 second
            System.out.println("Data written to queue: " + testData);
        });

        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);

        // Read task
        Future<String> readFuture = executor.submit(() -> {
            String data = queueManager.takeFromQueue();
            System.out.println("Data read from queue: " + data);
            return data;
        });

        // Wait for both tasks to complete
        writeFuture.get();
        String finalData = readFuture.get();
        System.out.println("Final read data: " + finalData);

        executor.shutdown();
    }
}