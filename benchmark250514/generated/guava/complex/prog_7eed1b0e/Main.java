import com.google.common.collect.ImmutableSortedSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Initialize a map and a TreeSet
        Map<String, Integer> map = new HashMap<>();
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Add elements to the TreeSet
        treeSet.add("Alpha");
        treeSet.add("Beta");

        // Perform operations on map
        if (map.containsKey("Two")) {
            System.out.println("Map contains key 'Two'");
        }

        // Perform operations on TreeSet
        if (treeSet.contains("Alpha")) {
            System.out.println("TreeSet contains 'Alpha'");
        }

        // Create an ImmutableSortedSet builder
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(1);

        // Perform more operations on map
        map.put("Four", 4);
        map.remove("One");

        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();

        // Perform more operations on TreeSet
        treeSet.add("Gamma");
        treeSet.remove("Beta");

        // Check if the set contains the value written earlier
        /* read */ boolean containsValue = set.contains(1);
        System.out.println(containsValue);

        // Iterate and print map values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterate and print TreeSet values
        for (String value : treeSet) {
            System.out.println("TreeSet value: " + value);
        }
    }
}