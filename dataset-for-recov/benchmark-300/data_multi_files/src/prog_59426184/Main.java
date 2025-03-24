import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Submit a task to perform the write operation
        Future<?> processorFuture = executor.submit(() -> {
            try {
                processor.processData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to perform the read operation
        Future<Integer> consumerFuture = executor.submit(() -> {
            try {
                return consumer.consumeData();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Wait for the write operation to complete
        processorFuture.get();

        // Retrieve the value from the read operation
        int value = consumerFuture.get();

        // Shutdown the executor
        executor.shutdown();

        System.out.println(value);

        // Additional complex code
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Submit a task to perform another write operation
        Future<?> anotherProcessorFuture = executor.submit(() -> {
            try {
                anotherQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to perform another read operation
        Future<String> anotherConsumerFuture = executor.submit(() -> {
            try {
                return anotherQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Wait for the write operation to complete
        anotherProcessorFuture.get();

        // Retrieve the value from the read operation
        String anotherValue = anotherConsumerFuture.get();

        // Shutdown the executor
        executor.shutdown();

        System.out.println(anotherValue);
    }
}