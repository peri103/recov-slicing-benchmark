import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a mutable map to build the immutable map
        MutableClassToInstanceMap<Object> mutableMap = MutableClassToInstanceMap.create();
        
        // Use the write method to put an instance into the map
        /* write */ mutableMap.putInstance(String.class, "Hello, World!");
        
        // Create another map to store data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("One", 1);
        dataMap.put("Two", 2);
        dataMap.put("Three", 3);
        
        // Perform operations on dataMap
        int sum = 0;
        for (Integer value : dataMap.values()) {
            sum += value;
        }
        
        // Print the sum of values in dataMap
        System.out.println("Sum of values in dataMap: " + sum);
        
        // Build the immutable map from the mutable map
        ImmutableClassToInstanceMap<Object> immutableMap = ImmutableClassToInstanceMap.copyOf(mutableMap);
        
        // Perform some unrelated operations
        Map<Integer, String> reverseMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        
        // Print the reverse map
        System.out.println("Reverse map: " + reverseMap);
        
        // Use the read method to get the instance from the map
        /* read */ String value = immutableMap.getInstance(String.class);
        
        // Print the value
        System.out.println(value);
        
        // Perform additional operations on reverseMap
        for (int i = 1; i <= reverseMap.size(); i++) {
            System.out.println("Value for key " + i + ": " + reverseMap.get(i));
        }
    }
}