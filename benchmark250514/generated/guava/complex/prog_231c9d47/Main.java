import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add a key-value pair to the map using the builder
        /* write */ builder.put("key1", 100);
        
        // Create an ImmutableList and ImmutableSet for demonstration
        ImmutableList<String> list = ImmutableList.of("A", "B", "C");
        ImmutableSet<Integer> set = ImmutableSet.of(1, 2, 3);
        
        // Perform some operations with the list and set
        for (String item : list) {
            System.out.println("List item: " + item);
        }
        
        for (Integer number : set) {
            System.out.println("Set item: " + number);
        }
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (Integer number : set) {
            sum += number;
        }
        System.out.println("Sum of set items: " + sum);
        
        // Read the value associated with "key1" from the map
        /* read */ Integer value = map.get("key1");
        
        // Print the retrieved value
        System.out.println(value);
        
        // Add more operations to increase complexity
        ImmutableSortedMap.Builder<String, String> builder2 = ImmutableSortedMap.naturalOrder();
        builder2.put("keyA", "ValueA");
        builder2.put("keyB", "ValueB");
        ImmutableSortedMap<String, String> map2 = builder2.build();
        
        for (String key : map2.keySet()) {
            System.out.println("Map2 key: " + key + ", value: " + map2.get(key));
        }
    }
}