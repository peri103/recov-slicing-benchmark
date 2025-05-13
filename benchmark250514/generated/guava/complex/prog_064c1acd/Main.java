import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();

        // Add an element to the set using the builder
        /* write */ builder.add(10);

        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> immutableSortedSet = builder.build();

        // Create a map to store some data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("One", 1);
        dataMap.put("Two", 2);
        dataMap.put("Three", 3);

        // Iterate over the map and print its contents
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Create an ImmutableList and perform some operations
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        for (String str : immutableList) {
            System.out.println("Element in ImmutableList: " + str);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first five integers: " + sum);

        // Check if the set contains the element
        /* read */ boolean containsValue = immutableSortedSet.contains(10);
        
        // Print the result
        System.out.println("Does ImmutableSortedSet contain 10? " + containsValue);

        // More operations with ImmutableList
        String firstElement = immutableList.get(0);
        System.out.println("First element in ImmutableList: " + firstElement);
    }
}