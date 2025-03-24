import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        try {
            // Ensure the writer thread has time to put the value
            Thread.sleep(100);
            
            /* read */ int value = queue.take();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}