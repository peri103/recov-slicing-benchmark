import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", 100);
        
        // Create a HashMap for additional operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of values in hashMap: " + sum);
        
        // Create an ImmutableList for demonstration
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        System.out.println("ImmutableList size: " + immutableList.size());
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform some operations on the ImmutableList
        for (String item : immutableList) {
            System.out.println("Item: " + item);
        }
        
        // Read the value from the map using the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println("Value from ImmutableSortedMap: " + value);
        
        // Additional operations to increase complexity
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("hello", "world");
        anotherMap.put("foo", "bar");
        
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}