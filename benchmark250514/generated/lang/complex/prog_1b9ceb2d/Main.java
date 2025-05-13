import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); // Start the stopwatch initially
        stopWatch.suspend(); // Suspend it to simulate some pause

        // Additional operations to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 100);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More operations
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);

        /* write */ stopWatch.resume(); // Resume the stopwatch

        // Additional calculations
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min number: " + min);

        // Further processing
        double average = (double) sum / numbers.size();
        System.out.println("Average of numbers: " + average);

        /* read */ long timeElapsed = stopWatch.getTime(); // Get the elapsed time
        System.out.println("Time elapsed: " + timeElapsed + " ms");
    }
}