import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

        // Add a range and its associated value
        /* write */ builder.put(Range.closed(1, 10), "Value");

        // Additional unrelated code to increase complexity
        Map<String, Integer> someMap = new HashMap<>();
        someMap.put("A", 100);
        someMap.put("B", 200);
        someMap.put("C", 300);

        for (Map.Entry<String, Integer> entry : someMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the value for a specific key within the range
        /* read */ String value = rangeMap.get(5);

        // Output the read value
        System.out.println(value);

        // Even more unrelated code
        int[] numbers = {5, 10, 15, 20, 25};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        someMap.put("D", 400);
        System.out.println("Updated Map: " + someMap);
    }
}