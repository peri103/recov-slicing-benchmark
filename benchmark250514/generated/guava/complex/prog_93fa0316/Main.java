import com.google.common.collect.ImmutableSortedSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add some elements to the builder
        builder.add(3);
        builder.add(2);
        
        // Use a HashMap to store some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        // Perform some operations on the map
        if (map.containsKey("One")) {
            int value = map.get("One");
            System.out.println("Map contains key 'One' with value: " + value);
        }
        
        // Add another element to the builder
        /* write */ builder.add(1);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);
        
        // Check if the set contains a specific element
        /* read */ boolean contains = set.contains(1);
        System.out.println("Set contains 1: " + contains);
        
        // Iterate over the set and print each element
        for (Integer num : set) {
            System.out.println("Element in set: " + num);
        }
        
        // Perform some additional operations on the map
        map.put("Three", 3);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}