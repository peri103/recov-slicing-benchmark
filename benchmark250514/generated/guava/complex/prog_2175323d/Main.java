import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        Builder<String, Integer> builder = ImmutableListMultimap.builder();

        // Add a key-value pair using the builder
        /* write */ builder.put("key1", 42);

        // Create a simple HashMap for demonstration
        Map<String, String> demoMap = new HashMap<>();
        demoMap.put("A", "Apple");
        demoMap.put("B", "Banana");
        demoMap.put("C", "Cherry");

        // Perform operations on the HashMap
        for (Map.Entry<String, String> entry : demoMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> multimap = builder.build();

        // Create another ImmutableListMultimap for demonstration
        Builder<String, String> anotherBuilder = ImmutableListMultimap.builder();
        anotherBuilder.put("fruit", "apple");
        anotherBuilder.put("fruit", "banana");
        ImmutableListMultimap<String, String> fruitMultimap = anotherBuilder.build();

        // Perform operations on the second multimap
        System.out.println("Fruits: " + fruitMultimap.get("fruit"));

        // Retrieve the value associated with the key
        /* read */ Integer value = multimap.get("key1").get(0);

        // Print the retrieved value
        System.out.println(value);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
}