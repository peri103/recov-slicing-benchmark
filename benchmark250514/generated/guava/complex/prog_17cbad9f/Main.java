import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Add entries to the builder
        builder.put("one", 1);
        builder.put("two", 2);
        builder.put("three", 3);
        
        // Build the ImmutableBiMap
        /* write */ ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Create an ImmutableList
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        
        // Process the list and biMap
        HashMap<String, String> fruitMap = new HashMap<>();
        for (String fruit : list) {
            fruitMap.put(fruit, fruit.toUpperCase());
        }
        
        // Print the fruit map
        for (String key : fruitMap.keySet()) {
            System.out.println(key + " -> " + fruitMap.get(key));
        }
        
        // Additional operations
        int sum = 0;
        for (Integer value : biMap.values()) {
            sum += value;
        }
        
        System.out.println("Sum of values in biMap: " + sum);
        
        // Read a value from the ImmutableBiMap
        /* read */ Integer value = biMap.get("one");
        
        // Print the value
        System.out.println("Value for 'one': " + value);
        
        // More complex operations
        HashMap<String, Integer> numberMap = new HashMap<>();
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        
        for (String key : numberMap.keySet()) {
            System.out.println(key + " -> " + numberMap.get(key));
        }
        
        // Calculate the product of all numbers
        int product = 1;
        for (Integer number : numberMap.values()) {
            product *= number;
        }
        
        System.out.println("Product of values in numberMap: " + product);
    }
}