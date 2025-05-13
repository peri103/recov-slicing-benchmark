import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();
        
        // Simulating some operation
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        
        // Performing some operations on the list
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Using a HashMap to store some data
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Accessing and printing map values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // More dummy operations to simulate elapsed time
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of first 10 numbers: " + product);
        
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}