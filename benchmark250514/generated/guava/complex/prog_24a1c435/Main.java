import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add an entry to the map using the builder
        /* write */ builder.put("key", 100);
        
        // Create an ImmutableList and ImmutableSet
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        ImmutableSet<String> set = ImmutableSet.of("dog", "cat", "bird");
        
        // Perform some operations on the list and set
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
        
        if (set.contains("dog")) {
            System.out.println("Set contains dog");
        }
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform additional operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);
        
        // Read the value associated with the key from the map
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println(value);
        
        // Additional unrelated operations
        ImmutableSortedMap.Builder<String, String> anotherBuilder = ImmutableSortedMap.naturalOrder();
        anotherBuilder.put("first", "A");
        anotherBuilder.put("second", "B");
        ImmutableSortedMap<String, String> anotherMap = anotherBuilder.build();
        
        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherMap.get(key));
        }
    }
}