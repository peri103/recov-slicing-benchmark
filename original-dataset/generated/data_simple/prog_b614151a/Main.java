import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written to the queue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Writer thread interrupted.");
            }
        });

        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from the queue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Reader thread interrupted.");
            }
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}