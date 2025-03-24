import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Thread to write data
        executor.submit(() -> {
            try {
                int value = random.nextInt(100);
                System.out.println("Generated value: " + value);
                /* write */ queue.put(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read data
        executor.submit(() -> {
            try {
                Thread.sleep(1000); // Simulate some delay
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor
        executor.shutdown();

        // Additional unrelated code to make the program more complex
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Random numbers array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of random numbers: " + sum);
    }
}