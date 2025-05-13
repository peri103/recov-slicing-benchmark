import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        /* write */ stopWatch.start();

        // Simulate some processing time
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        // Perform operations on the numbers list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        map.put("sum", sum);

        // Insert additional operations
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, i * i);
        }

        // Use the map to retrieve values
        int retrievedSum = map.get("sum");
        System.out.println("Retrieved sum: " + retrievedSum);

        // Perform more operations
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}