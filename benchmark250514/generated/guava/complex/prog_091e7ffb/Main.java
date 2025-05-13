import com.google.common.collect.ImmutableSortedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initializing a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Adding a key-value pair using the write method
        /* write */ builder.put("key", 1);
        
        // Adding more elements to a regular HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("alpha", 100);
        hashMap.put("beta", 200);
        
        // Performing operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in HashMap: " + sum);
        
        // Building the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Performing additional operations before reading
        int maxValue = Integer.MIN_VALUE;
        for (Integer value : hashMap.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Maximum value in HashMap: " + maxValue);
        
        // Reading the value using the read method
        /* read */ int value = map.get("key");
        
        // Outputting the result
        System.out.println("Value from ImmutableSortedMap: " + value);
        
        // Additional operations with arrays
        int[] numbers = {5, 10, 15, 20};
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total sum of array elements: " + total);
    }
}