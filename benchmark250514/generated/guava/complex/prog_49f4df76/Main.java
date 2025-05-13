import com.google.common.collect.ImmutableSortedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();

        // Use the builder to add a key-value pair
        /* write */ builder.put("key1", 100);

        // Create a HashMap and add some elements
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key2", 200);
        hashMap.put("key3", 300);

        // Perform some operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Create another ImmutableSortedMap using a different builder
        ImmutableSortedMap.Builder<String, String> stringBuilder = ImmutableSortedMap.naturalOrder();
        stringBuilder.put("a", "apple");
        stringBuilder.put("b", "banana");
        ImmutableSortedMap<String, String> stringMap = stringBuilder.build();
        
        // Perform some operations on the stringMap
        for (String key : stringMap.keySet()) {
            System.out.println("Value for " + key + ": " + stringMap.get(key));
        }

        // Read the value associated with "key1"
        /* read */ Integer value = map.get("key1");

        // Print the value
        System.out.println(value);

        // Add more elements to the HashMap and perform further operations
        hashMap.put("key4", 400);
        hashMap.put("key5", 500);
        int product = 1;
        for (Integer val : hashMap.values()) {
            product *= val;
        }
        System.out.println("Product of values in HashMap: " + product);
    }
}