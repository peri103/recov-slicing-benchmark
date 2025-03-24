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

        // Submit tasks to the executor
        executor.submit(() -> {
            int data = random.nextInt(100);
            System.out.println("Generated data: " + data);
            processor.processData(data);
        });

        executor.submit(() -> {
            consumer.consumeData();
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(10);
        }
        System.out.println("Sum of random numbers: " + sum);

        // Another unrelated code block
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println("Color: " + color);
        }
    }
}