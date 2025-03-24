import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Additional code to make the program more complex
        int randomNumber = random.nextInt(100);
        System.out.println("Generated random number: " + randomNumber);

        // Write thread
        executor.submit(() -> {
            try {
                /* write */ queue.put(randomNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Additional code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Read thread
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Additional code to make the program more complex
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        executor.shutdown();
    }
}