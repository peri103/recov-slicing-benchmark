import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Start the consumer in a separate thread
        Thread consumerThread = new Thread(consumer::consumeData);
        consumerThread.start();

        // Process data
        processor.processData();

        // Wait for the consumer thread to finish
        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}