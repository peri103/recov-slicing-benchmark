import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                processor.processData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        writerThread.start();

        // Perform the read operation in the main thread
        int value = consumer.consumeData();
        System.out.println("Value from queue: " + value);

        // Ensure the writer thread completes
        writerThread.join();
    }
}