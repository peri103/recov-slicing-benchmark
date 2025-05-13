import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Add elements to the builder
        /* write */ builder.add(1);
        builder.add(2);
        builder.add(3);
        
        // Build the ImmutableList
        ImmutableList<Integer> list = builder.build();
        
        // Initialize a builder for ImmutableSet
        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();
        
        // Add elements to the set builder
        setBuilder.add("A");
        setBuilder.add("B");
        setBuilder.add("C");
        
        // Build the ImmutableSet
        ImmutableSet<String> set = setBuilder.build();
        
        // Create a map and populate it
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Perform operations on the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Perform operations on the set
        for (String element : set) {
            System.out.println("Set element: " + element);
        }
        
        // Perform operations on the list
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.println("Sum of elements in list: " + sum);
        
        // Read from the ImmutableList
        /* read */ int value = list.get(0);
        System.out.println("First element in list: " + value);
        
        // Additional operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
        
        // Additional operations on the map
        if (map.containsKey("Two")) {
            System.out.println("Map contains key 'Two' with value: " + map.get("Two"));
        }
    }
}