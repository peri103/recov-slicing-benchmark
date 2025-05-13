import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); // Start the stopwatch to enable resume
        stopWatch.suspend(); // Suspend the stopwatch so that it can be resumed
        /* write */ stopWatch.resume(); // Resume the stopwatch

        // Simulate some operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put(numbers.get(i), "Number: " + numbers.get(i));
        }

        // More complex operations
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        long elapsedTime = 0;
        try {
            Thread.sleep(1000); // Simulate some elapsed time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        /* read */ elapsedTime = stopWatch.getTime(); // Get the elapsed time
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);

        // Additional operations
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        // Final operations
        if (map.containsKey(20)) {
            System.out.println("Map contains key 20 with value: " + map.get(20));
        }
    }
}