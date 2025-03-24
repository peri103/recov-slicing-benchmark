import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Additional code to make the program more complex
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Performing some unrelated task...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Additional code to make the program more complex
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Performing another unrelated task...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value " + value + " has been read from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}