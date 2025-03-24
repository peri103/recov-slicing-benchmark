import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> syncQueue = new SynchronousQueue<>();
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Random random = new Random();

        // Create a thread to perform the write operation
        Thread writer = new Thread(() -> {
            try {
                int value = random.nextInt(100);
                /* write */ syncQueue.put(value);
                System.out.println("Written to SynchronousQueue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writer.start();

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            try {
                blockingQueue.put(i * 10);
                System.out.println("Added to BlockingQueue: " + (i * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Perform the read operation in the main thread
        try {
            /* read */ int value = syncQueue.take();
            System.out.println("Read from SynchronousQueue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform more unrelated operations
        while (!blockingQueue.isEmpty()) {
            try {
                int value = blockingQueue.take();
                System.out.println("Removed from BlockingQueue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}