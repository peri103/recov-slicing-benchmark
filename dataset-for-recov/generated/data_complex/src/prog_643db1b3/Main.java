import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Writer Thread for SynchronousQueue
        executorService.execute(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written to SynchronousQueue: 42");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Reader Thread for SynchronousQueue
        executorService.execute(() -> {
            try {
                Thread.sleep(100); // Simulate some processing delay
                /* read */ int value = queue.take();
                System.out.println("Value read from SynchronousQueue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Writer Thread for LinkedBlockingQueue
        executorService.execute(() -> {
            try {
                stringQueue.put("Hello");
                stringQueue.put("World");
                System.out.println("Values written to LinkedBlockingQueue: Hello, World");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Reader Thread for LinkedBlockingQueue
        executorService.execute(() -> {
            try {
                Thread.sleep(200); // Simulate some processing delay
                while (!stringQueue.isEmpty()) {
                    String str = stringQueue.take();
                    System.out.println("Value read from LinkedBlockingQueue: " + str);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();
    }
}