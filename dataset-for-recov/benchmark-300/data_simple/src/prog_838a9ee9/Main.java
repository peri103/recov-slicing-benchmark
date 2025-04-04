import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the writer thread
        writerThread.start();
        
        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        
        // Print the value to ensure it was read correctly
        System.out.println(value);
        
        // Wait for the writer thread to finish
        writerThread.join();
    }
}