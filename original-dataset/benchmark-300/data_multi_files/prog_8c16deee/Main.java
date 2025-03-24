import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Create a thread to process data
        Thread processorThread = new Thread(() -> {
            processor.processData(42);
        });

        // Create a thread to consume data
        Thread consumerThread = new Thread(() -> {
            consumer.consumeData();
        });

        // Start the threads
        processorThread.start();
        consumerThread.start();

        // Wait for the threads to finish
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}