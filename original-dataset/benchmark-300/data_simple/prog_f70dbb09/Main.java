import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Start a new thread to perform the write operation
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
        try {
            /* read */ int value = queue.take();
            System.out.println("Read value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Wait for the writer thread to finish
        try {
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}