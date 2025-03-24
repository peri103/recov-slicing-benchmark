import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Thread to process data
        Thread processorThread = new Thread(() -> {
            processor.processData(42);
        });

        // Thread to consume data
        Thread consumerThread = new Thread(() -> {
            consumer.consumeData();
        });

        // Start the threads
        processorThread.start();
        consumerThread.start();

        // Wait for threads to finish
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}