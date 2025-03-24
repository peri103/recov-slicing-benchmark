import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Create a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                processor.processData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Perform the read operation in the main thread
        int value = consumer.consumeData();

        // Print the value to ensure it was read correctly
        System.out.println("Value read from SynchronousQueue: " + value);

        // Wait for the writer thread to finish
        writerThread.join();
    }
}
