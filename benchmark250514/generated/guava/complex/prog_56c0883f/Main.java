import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", "value");
        
        // Create another ImmutableListMultimap for demonstration
        ImmutableListMultimap.Builder<String, Integer> listBuilder = ImmutableListMultimap.builder();
        listBuilder.put("numbers", 1);
        listBuilder.put("numbers", 2);
        listBuilder.put("numbers", 3);
        ImmutableListMultimap<String, Integer> listMultimap = listBuilder.build();
        
        // Work with a HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        // Read the value associated with the key
        /* read */ java.util.Set<String> values = multimap.get("key");
        
        // Print the value(s) retrieved
        System.out.println(values);
        
        // Additional operations on the ImmutableListMultimap
        java.util.List<Integer> numberList = listMultimap.get("numbers");
        int product = 1;
        for (Integer number : numberList) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }
}