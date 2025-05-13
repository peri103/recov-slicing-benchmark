import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the builder
        builder.put(String.class, "Hello, World!");

        // Build the ImmutableClassToInstanceMap
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Create a simple map and populate it
        Map<Integer, String> simpleMap = new HashMap<>();
        simpleMap.put(1, "One");
        simpleMap.put(2, "Two");
        simpleMap.put(3, "Three");
        
        // Convert the simple map to an immutable map
        ImmutableMap<Integer, String> immutableSimpleMap = ImmutableMap.copyOf(simpleMap);

        // Use the immutable map
        for (Integer key : immutableSimpleMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + immutableSimpleMap.get(key));
        }
        
        // Perform some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve the instance from the ImmutableClassToInstanceMap
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
        
        // More complex operations
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}