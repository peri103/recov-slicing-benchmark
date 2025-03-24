import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor dataProcessor = new DataProcessor();
        Worker worker1 = new Worker("Worker1", dataProcessor);
        Worker worker2 = new Worker("Worker2", dataProcessor);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to add data
        executor.submit(() -> {
            worker1.addData(42);
        });

        // Task to process data
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                int data = worker2.processData();
                System.out.println("Processed data: " + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);

        // Additional unrelated code to make the program more complex
        LinkedBlockingDeque<String> stringDeque = new LinkedBlockingDeque<>();
        stringDeque.addLast("Hello");
        stringDeque.addLast("World");

        while (!stringDeque.isEmpty()) {
            System.out.println(stringDeque.takeFirst());
        }

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}