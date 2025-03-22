import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(10);
                System.out.println("Value written: 10");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Write operation interrupted");
            }
        });

        // Thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Read operation interrupted");
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }
    }
}