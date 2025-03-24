import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Worker {
    private DataProcessor processor = new DataProcessor();
    private Random random = new Random();

    public void start() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Write task
        executor.submit(() -> {
            try {
                int value = random.nextInt(100);
                System.out.println("Writing value: " + value);
                processor.writeData(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Read task
        executor.submit(() -> {
            try {
                // Simulate some processing before reading
                Thread.sleep(1000);
                int value = processor.readData();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}
