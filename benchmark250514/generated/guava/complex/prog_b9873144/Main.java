import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Use the builder to add elements to the list
        /* write */ builder.add(42);
        
        // Perform some operations with ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        // Create a map to store some data
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        // Iterate over the map and print keys and values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Build the ImmutableList from the builder
        ImmutableList<Integer> list = builder.build();
        
        // Additional complex operations
        int sum = 0;
        for (int i = 0; i < stringList.size(); i++) {
            sum += map.getOrDefault(stringList.get(i).substring(0, 1), 0);
        }
        
        // Print the sum to demonstrate complexity
        System.out.println("Sum of mapped values: " + sum);
        
        // Read the element at index 0 from the ImmutableList
        /* read */ int value = list.get(0);
        
        // Print the read value to ensure correctness
        System.out.println(value);
        
        // Further operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ImmutableList element at index " + i + ": " + list.get(i));
        }
    }
}