import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Add a key-value pair using the builder
        /* write */ builder.put("key1", 1);
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Create a HashMap and populate it with some data
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Iterate over the HashMap and print its contents
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Create an ImmutableMap using Guava
        ImmutableMap<String, String> immutableMap = ImmutableMap.of("fruit", "apple", "color", "red");
        
        // Access and print a value from the ImmutableMap
        String fruit = immutableMap.get("fruit");
        System.out.println("Fruit: " + fruit);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 5: " + sum);
        
        // Retrieve the value using the key from the ImmutableBiMap
        /* read */ Integer value = biMap.get("key1");
        
        // Print the value
        System.out.println("Value from biMap: " + value);
        
        // Perform more operations with HashMap
        hashMap.put("country", "Imaginary");
        hashMap.put("language", "Gibberish");
        
        // Iterate over the updated HashMap and print its contents
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}