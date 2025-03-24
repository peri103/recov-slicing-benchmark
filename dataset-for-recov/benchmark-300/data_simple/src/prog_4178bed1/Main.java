import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        try {
            SynchronousQueue<Integer> queue = new SynchronousQueue<>();
            // Thread to perform the write operation
            Thread writerThread = new Thread(() -> {
                try {
                    /* write */ queue.put(42);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            // Thread to perform the read operation
            Thread readerThread = new Thread(() -> {
                try {
                    /* read */ int value = queue.take();
                    System.out.println("Read value: " + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            // Start the threads
            writerThread.start();
            readerThread.start();
            // Wait for the threads to finish
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}