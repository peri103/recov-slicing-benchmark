import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        BlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(10);
        
        // Writer thread for SynchronousQueue
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
                messageQueue.put("Value 42 written to SynchronousQueue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Reader thread for SynchronousQueue
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
                messageQueue.put("Value " + value + " read from SynchronousQueue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Additional thread to process messages from messageQueue
        Thread messageProcessor = new Thread(() -> {
            try {
                String message = messageQueue.take();
                System.out.println("Message: " + message);
                message = messageQueue.take();
                System.out.println("Message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writer.start();
        reader.start();
        messageProcessor.start();
        
        try {
            writer.join();
            reader.join();
            messageProcessor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}