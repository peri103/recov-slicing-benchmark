import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Writer task
        executor.submit(() -> {
            try {
                writer.writeData(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Some unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
        }

        // Reader task
        executor.submit(() -> {
            try {
                int data = reader.readData();
                System.out.println("Received data: " + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}