import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10);
        Random random = new Random();

        // Thread to write the value to the SynchronousQueue
        Thread writer = new Thread(() -> {
            try {
                int value = random.nextInt(100);
                /* write */ queue.put(value);
                System.out.println("Written to SynchronousQueue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read the value from the SynchronousQueue
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read from SynchronousQueue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to write random values to the buffer
        Thread bufferWriter = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    int value = random.nextInt(100);
                    buffer.put(value);
                    System.out.println("Written to buffer: " + value);
                    Thread.sleep(200); // Simulate some delay
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read values from the buffer
        Thread bufferReader = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    int value = buffer.take();
                    System.out.println("Read from buffer: " + value);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start all threads
        writer.start();
        reader.start();
        bufferWriter.start();
        bufferReader.start();

        // Wait for all threads to finish
        try {
            writer.join();
            reader.join();
            bufferWriter.join();
            bufferReader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}