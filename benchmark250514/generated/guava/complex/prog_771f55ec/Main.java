import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Add a key-value pair using the builder
        /* write */ builder.put("key", "value");
        
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<Integer, String> setBuilder = ImmutableSetMultimap.builder();
        
        // Add multiple key-value pairs to the ImmutableSetMultimap
        setBuilder.put(1, "one");
        setBuilder.put(2, "two");
        setBuilder.put(3, "three");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<Integer, String> setMultimap = setBuilder.build();
        
        // Create a HashMap and populate it with some data
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 100);
        hashMap.put("B", 200);
        hashMap.put("C", 300);
        
        // Iterate over the entries of the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Retrieve the value associated with the key
        /* read */ String value = multimap.get("key").get(0);
        
        // Print the value
        System.out.println(value);
        
        // Iterate over the ImmutableSetMultimap and print its contents
        for (Integer key : setMultimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + setMultimap.get(key));
        }
        
        // Perform some additional operations with the HashMap
        hashMap.put("D", 400);
        hashMap.remove("B");
        
        // Print the updated HashMap
        System.out.println("Updated HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}