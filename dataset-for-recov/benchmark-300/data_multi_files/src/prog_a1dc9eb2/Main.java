import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataProducer producer = new DataProducer(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Submit the producer task
        executor.submit(producer::produceData);

        // Some unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println("Executing task " + Thread.currentThread().getName());
            });
        }

        // Submit the consumer task
        executor.submit(consumer::consumeData);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}