import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the BlockingQueue
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        
        try {
            // Write value to the queue
            /* write */ queue.put(42);

            // Read value from the queue
            /* read */ int value = queue.take();

            // Print the value
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}