import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StopWatch
        StopWatch stopWatch = new StopWatch();

        // Initialize an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Start the StopWatch
        /* write */ stopWatch.start();

        // Perform some complex operations
        for (int i = 0; i < 1000000; i++) {
            int x = i * i;
            int y = x / (i + 1);
            numbers.add(y);
        }

        // Calculate average of numbers
        double average = sum / (double) numbers.size();
        System.out.println("Average of numbers: " + average);

        // Get the elapsed time
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");

        // Perform additional operations
        int product = 1;
        for (int num : numbers) {
            product *= (num + 1);
        }
        System.out.println("Product of numbers: " + product);
    }
}