import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Initialize the list with some numbers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Shuffle the numbers to simulate some processing
        Collections.shuffle(numbers);

        /* write */ stopWatch.start();

        // Perform a complex operation: sorting the shuffled numbers
        Collections.sort(numbers);

        // Simulate more operations to allow time to elapse
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        // Print the sorted list and sum
        System.out.println("Sorted numbers: " + numbers);
        System.out.println("Sum of numbers: " + sum);

        // Perform another unrelated operation
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}