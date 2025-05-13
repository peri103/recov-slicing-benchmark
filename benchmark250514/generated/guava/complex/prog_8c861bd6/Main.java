import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSet
        Builder<String> builder = ImmutableSet.builder();
        
        // Add elements to the builder
        builder.add("example");
        builder.add("test");
        builder.add("sample");
        
        // Build the ImmutableSet
        ImmutableSet<String> set = builder.build();
        
        // Initialize an ImmutableList
        ImmutableList<String> list = ImmutableList.of("example", "test", "sample");
        
        // Initialize an ImmutableMap
        ImmutableMap<String, Integer> map = ImmutableMap.of("example", 1, "test", 2, "sample", 3);
        
        // Perform some operations on the list and map
        System.out.println("List size: " + list.size());
        System.out.println("Map size: " + map.size());
        
        // Iterate over the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }
        
        // Access map values
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", Map value: " + map.get(key));
        }
        
        // Perform operations on the set
        System.out.println("Set size: " + set.size());
        System.out.println("Set contains 'test': " + set.contains("test"));
        
        // Perform some calculations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Access the set
        /* read */ boolean contains = set.contains("example");
        
        // Output the result of the read operation
        System.out.println("Set contains 'example': " + contains);
        
        // Perform operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List item at index " + i + ": " + list.get(i));
        }
        
        // Perform operations on the map
        if (map.containsKey("sample")) {
            System.out.println("Map contains key 'sample' with value: " + map.get("sample"));
        }
    }
}