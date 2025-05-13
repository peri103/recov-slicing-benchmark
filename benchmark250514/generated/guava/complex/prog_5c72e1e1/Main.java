import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Create another ImmutableSortedMap using different keys and values
        ImmutableSortedMap.Builder<String, Integer> builder2 = ImmutableSortedMap.naturalOrder();
        builder2.put("anotherKey", 100);
        ImmutableSortedMap<String, Integer> map2 = builder2.build();

        // Create a HashMap and populate it with some values
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Iterate over the HashMap and print its entries
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Create an ImmutableList and perform operations
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        for (String fruit : immutableList) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Read the value associated with the key from the original map
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println(value);
        
        // Perform additional operations on map2
        Integer anotherValue = map2.get("anotherKey");
        System.out.println("Another Value: " + anotherValue);
        
        // Perform calculations and manipulate data
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}