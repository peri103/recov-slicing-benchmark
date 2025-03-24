import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42); // Write the value 42 to the queue
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the writer thread
        writerThread.start();
        
        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take(); // Read the value from the queue
            System.out.println(value); // Print the read value
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}