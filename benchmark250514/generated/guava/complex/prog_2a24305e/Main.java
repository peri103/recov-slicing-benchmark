import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> setBuilder = ImmutableSetMultimap.builder();
        
        // Create a HashMap for unrelated operations
        Map<String, Integer> map = new HashMap<>();
        
        // Add some data to the map
        map.put("one", 1);
        map.put("two", 2);
        
        // Iterate over the map and add values to the setBuilder
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            setBuilder.put(entry.getKey(), entry.getValue());
        }
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> setMultimap = setBuilder.build();
        
        // Use the setMultimap to perform some operations
        for (String key : setMultimap.keySet()) {
            System.out.println("SetMultimap Key: " + key);
            for (Integer value : setMultimap.get(key)) {
                System.out.println("SetMultimap Value: " + value);
            }
        }

        // Add data to the ImmutableListMultimap builder
        /* write */ builder.put("key", "value");
        
        // Perform some unrelated operations
        map.put("three", 3);
        map.put("four", 4);
        
        // Iterate over the map and print values
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Use the multimap to retrieve the value
        /* read */ String value = multimap.get("key").get(0);
        System.out.println("ImmutableListMultimap Value: " + value);
        
        // Perform more unrelated operations
        map.put("five", 5);
        map.put("six", 6);
        
        // Print the final state of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Final Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}