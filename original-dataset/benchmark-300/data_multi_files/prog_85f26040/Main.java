import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);
        
        // Process data
        processor.processData();
        
        // Consume data
        int value = consumer.consumeData();
        
        // Print the value
        System.out.println("Value from queue: " + value);
    }
}