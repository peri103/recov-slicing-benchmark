import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add an entry to the map
        /* write */ builder.put("key1", 100);
        
        // Create an ImmutableList of strings
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        
        // Create an ImmutableSet from the ImmutableList
        ImmutableSet<String> immutableSet = ImmutableSet.copyOf(immutableList);
        
        // Iterate over the ImmutableSet and print each element
        for (String fruit : immutableSet) {
            System.out.println(fruit);
        }
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform some operations with the map
        if (map.containsKey("key1")) {
            System.out.println("Map contains key1");
        }
        
        // Retrieve the value associated with the key
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println(value);
        
        // Additional operations with ImmutableList
        for (int i = 0; i < immutableList.size(); i++) {
            System.out.println("List element: " + immutableList.get(i));
        }
    }
}