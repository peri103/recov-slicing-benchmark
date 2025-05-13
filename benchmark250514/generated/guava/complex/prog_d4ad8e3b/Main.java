import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Create a map to store values
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Create an ImmutableList and perform operations
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        for (String item : immutableList) {
            System.out.println("ImmutableList item: " + item);
        }

        /* write */
        builder.add(1);  // Add elements to the builder
        builder.add(2);
        builder.add(3);
        ImmutableSortedSet<Integer> sortedSet = builder.build();  // Build the ImmutableSortedSet

        // Perform operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        // Perform operations on the ImmutableSortedSet
        for (Integer number : sortedSet) {
            System.out.println("SortedSet item: " + number);
        }

        // Calculate sum of map values
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of map values: " + sum);

        /* read */
        boolean containsValue = sortedSet.contains(1);  // Check if the set contains the value
        System.out.println("Contains 1: " + containsValue);  // Output the result

        // Perform additional operations on the ImmutableSortedSet
        boolean containsValue2 = sortedSet.contains(2);
        System.out.println("Contains 2: " + containsValue2);
    }
}