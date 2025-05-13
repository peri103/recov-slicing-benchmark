import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StopWatch for timing
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();

        // Simulate some processing time
        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an ArrayList and perform operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Perform calculations
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Simulate more processing time
        try {
            Thread.sleep(500); // Sleep for another 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Use StopWatch to get elapsed time
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");

        // Output the sum of numbers
        System.out.println("Sum of numbers: " + sum);

        // Perform additional operations on ArrayList
        int product = 1;
        for (int number : numbers) {
            product *= number == 0 ? 1 : number;
        }

        // Output the product of numbers
        System.out.println("Product of numbers: " + product);
    }
}