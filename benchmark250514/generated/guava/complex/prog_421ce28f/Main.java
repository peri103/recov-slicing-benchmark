import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Use a HashMap to store additional data
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        
        // Create an ImmutableList for demonstration purposes
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");

        // Perform operations on the HashMap
        for (int key : hashMap.keySet()) {
            System.out.println("HashMap key: " + key + ", value: " + hashMap.get(key));
        }

        // Perform operations on the ImmutableList
        for (String item : immutableList) {
            System.out.println("ImmutableList item: " + item);
        }

        // Add range and value to builder
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        // Retrieve value from rangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println("Retrieved from rangeMap: " + value);

        // Perform more operations to make the program more complex
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}