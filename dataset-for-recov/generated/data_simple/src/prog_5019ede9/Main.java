import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Create a new thread to perform the write operation
        new Thread(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written to the queue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Write operation interrupted.");
            }
        }).start();

        // Create a new thread to perform the read operation
        new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from the queue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Read operation interrupted.");
            }
        }).start();
    }
}