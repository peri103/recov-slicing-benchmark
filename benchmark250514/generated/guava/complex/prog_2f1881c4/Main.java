import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add an entry to the map
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Initialize an ImmutableList and ImmutableSet
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        ImmutableSet<Integer> set = ImmutableSet.of(1, 2, 3, 4, 5);
        
        // Perform some operations with the list and set
        System.out.println("List contains 'banana': " + list.contains("banana"));
        System.out.println("Set contains 3: " + set.contains(3));
        
        // Calculate the sum of elements in the set
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        System.out.println("Sum of set elements: " + sum);
        
        // Retrieve the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value to ensure the read operation was successful
        System.out.println("Value from map: " + value);
        
        // Additional operations with ImmutableList
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
        
        // More complex operations
        ImmutableSortedMap.Builder<String, Integer> anotherBuilder = ImmutableSortedMap.naturalOrder();
        anotherBuilder.put("anotherKey", 100);
        ImmutableSortedMap<String, Integer> anotherMap = anotherBuilder.build();
        
        // Use the anotherMap to demonstrate complexity
        for (String key : anotherMap.keySet()) {
            System.out.println("Another map key: " + key + ", value: " + anotherMap.get(key));
        }
    }
}