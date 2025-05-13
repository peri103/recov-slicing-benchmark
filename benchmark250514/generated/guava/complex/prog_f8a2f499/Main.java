import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key1", 100);

        // Create another ImmutableSortedMap with different values
        ImmutableSortedMap.Builder<String, Integer> builder2 = ImmutableSortedMap.naturalOrder();
        builder2.put("key2", 200);
        builder2.put("key3", 300);
        ImmutableSortedMap<String, Integer> map2 = builder2.build();
        
        // Create an ImmutableList and perform some operations
        ImmutableList<String> list = ImmutableList.of("A", "B", "C");
        for (String item : list) {
            System.out.println("Item: " + item);
        }

        // Create a HashMap and perform operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Perform some unrelated operations to increase complexity
        int sum = 0;
        for (Integer value : map2.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map2: " + sum);

        // Read the value associated with "key1"
        /* read */ Integer value = map.get("key1");

        // Print the read value
        System.out.println("Value associated with 'key1': " + value);
    }
}