import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        /* write */ builder.add(10);
        
        // Create a map to store some data
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("ten", 10);
        
        // Perform some operations on the map
        if (map.containsKey("ten")) {
            map.put("ten", map.get("ten") + 5);
        }
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Create an ImmutableList from the map values
        ImmutableList<Integer> list = ImmutableList.copyOf(map.values());
        
        // Iterate over the list and print values
        for (Integer value : list) {
            System.out.println("Map value: " + value);
        }
        
        /* read */ boolean containsValue = sortedSet.contains(10);
        
        // Print the result of the read operation
        System.out.println("SortedSet contains 10: " + containsValue);
        
        // Perform additional operations on the sortedSet
        if (sortedSet.contains(15)) {
            System.out.println("SortedSet contains 15");
        } else {
            System.out.println("SortedSet does not contain 15");
        }
        
        // Print all elements in the sortedSet
        for (Integer element : sortedSet) {
            System.out.println("SortedSet element: " + element);
        }
    }
}