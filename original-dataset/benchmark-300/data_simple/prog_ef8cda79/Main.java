import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Start a new thread to write to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Main thread reads from the queue
        /* read */ int value = queue.take();
        System.out.println(value);
        
        // Ensure the writer thread completes
        writerThread.join();
    }
}