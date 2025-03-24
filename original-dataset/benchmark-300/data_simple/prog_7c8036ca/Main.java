import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Start a new thread to perform the write operation
        new Thread(() -> {
            try {
                /* write */ queue.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}