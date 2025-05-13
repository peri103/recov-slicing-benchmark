import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        // Shuffling numbers to simulate a complex operation
        Collections.shuffle(numbers);
        
        // Start the stopwatch to measure time taken for sorting
        /* write */ stopWatch.start();
        
        // Sorting the numbers
        Collections.sort(numbers);
        
        // Simulating some additional operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Performing a dummy operation
        int result = sum * 2;
        
        // Get the elapsed time after sorting
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed for sorting and operations: " + timeElapsed + " milliseconds");
        
        // Printing the sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Printing the result of the dummy operation
        System.out.println("Result of dummy operation: " + result);
    }
}