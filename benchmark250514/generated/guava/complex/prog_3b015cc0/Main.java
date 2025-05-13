import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add an entry using the builder
        /* write */ builder.put("key", 42);
        
        // Create a HashMap and add some entries
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Perform some operations on the HashMap
        String name = hashMap.get("name");
        String city = hashMap.get("city");
        System.out.println("Name: " + name + ", City: " + city);

        // Create an ImmutableList and perform operations
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        for (String fruit : immutableList) {
            System.out.println("Fruit: " + fruit);
        }

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform more operations on the ImmutableSortedMap
        if (map.containsKey("key")) {
            System.out.println("Map contains the key 'key'.");
        }
        
        // Read the value using the key
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println("Value from map: " + value);

        // Additional operations with ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> anotherBuilder = ImmutableSortedMap.naturalOrder();
        anotherBuilder.put("anotherKey", 99);
        ImmutableSortedMap<String, Integer> anotherMap = anotherBuilder.build();
        System.out.println("Another map value: " + anotherMap.get("anotherKey"));
    }
}