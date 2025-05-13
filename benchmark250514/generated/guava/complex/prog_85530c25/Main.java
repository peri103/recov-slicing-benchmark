import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, Integer> builder = ImmutableListMultimap.builder();
        
        // Initialize the builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> setBuilder = ImmutableSetMultimap.builder();
        
        // Using the builder to add key-value pairs to ImmutableSetMultimap
        setBuilder.put("setKey1", 100);
        setBuilder.put("setKey1", 200);
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> setMultimap = setBuilder.build();
        
        // Retrieve values associated with "setKey1"
        System.out.println("ImmutableSetMultimap values for 'setKey1': " + setMultimap.get("setKey1"));
        
        // Using the builder to add key-value pairs to ImmutableListMultimap
        /* write */ builder.put("key1", 42);
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        
        // Initialize a HashMap for additional complexity
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("mapKey1", "value1");
        hashMap.put("mapKey2", "value2");
        
        // Print all entries in the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        // Retrieve value associated with "key1" from ImmutableListMultimap
        /* read */ Integer value = multimap.get("key1").get(0);
        
        // Print the retrieved value
        System.out.println("ImmutableListMultimap value for 'key1': " + value);
        
        // Perform some calculations to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}