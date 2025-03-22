import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written: 42");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        writerThread.start();
        readerThread.start();
        
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}