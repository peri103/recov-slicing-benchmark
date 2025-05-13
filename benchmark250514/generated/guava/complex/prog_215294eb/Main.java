import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableBiMap using the write method
        /* write */ ImmutableBiMap<String, Integer> biMap = ImmutableBiMap.of("one", 1, "two", 2, "three", 3);

        // Additional unrelated operations
        ImmutableMap<String, String> map = ImmutableMap.of("apple", "fruit", "carrot", "vegetable");
        String fruit = map.get("apple");
        System.out.println("Apple is a type of: " + fruit);

        // More complex operations with ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap2 = ImmutableBiMap.of("four", 4, "five", 5);
        for (String key : biMap2.keySet()) {
            System.out.println("Key: " + key + ", Value: " + biMap2.get(key));
        }

        // Perform calculations
        int sum = 0;
        for (Integer value : biMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in biMap: " + sum);

        // Read a value from the ImmutableBiMap using the read method
        /* read */ Integer value = biMap.get("two");
        
        // Print the value to verify
        System.out.println("Value associated with 'two': " + value);

        // Further unrelated operations
        int product = 1;
        for (Integer val : biMap2.values()) {
            product *= val;
        }
        System.out.println("Product of values in biMap2: " + product);

        // Final output to ensure program complexity
        System.out.println("Program executed successfully.");
    }
}