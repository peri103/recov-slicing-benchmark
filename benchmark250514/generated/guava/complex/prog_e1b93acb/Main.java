import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Add multiple entries to the map using the builder
        builder.put("key1", 10);
        builder.put("key2", 20);
        builder.put("key3", 30);
        
        // Add an entry to the map using the builder
        /* write */ builder.put("key", 42);
        
        // Build the immutable map
        ImmutableMap<String, Integer> map = builder.build();
        
        // Create an ImmutableList
        ImmutableList<String> keysList = ImmutableList.of("key1", "key2", "key3", "key");
        
        // Iterate over the keys and print values
        for (String key : keysList) {
            System.out.println("Value for " + key + ": " + map.get(key));
        }
        
        // Create a HashMap and populate it with some values
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");
        
        // Iterate over the HashMap and print its entries
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        // Perform some calculations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in the map: " + sum);
        
        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println("Read value: " + value);
        
        // Create another ImmutableList and perform operations
        ImmutableList<Integer> numbers = ImmutableList.of(1, 2, 3, 4, 5);
        int product = 1;
        for (Integer num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}