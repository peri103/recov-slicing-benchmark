import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println(value);
        
        // Ensure the writer thread completes
        writerThread.join();
    }
}