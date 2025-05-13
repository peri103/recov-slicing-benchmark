import com.google.common.collect.ImmutableSortedSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements using the builder
        /* write */ builder.add(1);
        
        // Introduce a HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Iterate over the map and perform operations
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();

        // Perform some operations on the set
        Set<Integer> doubledSet = new HashSet<>();
        for (Integer number : sortedSet) {
            doubledSet.add(number * 2);
        }
        
        // Output the doubled set
        System.out.println("Doubled Set: " + doubledSet);

        // Check if the set contains the element
        /* read */ boolean contains = sortedSet.contains(1);
        
        // Output the result
        System.out.println("Contains 1: " + contains);

        // Additional logic for complexity
        int sum = 0;
        for (Integer number : sortedSet) {
            sum += number;
        }
        System.out.println("Sum of elements in the set: " + sum);
    }
}