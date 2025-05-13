import com.google.common.collect.ImmutableListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Additional unrelated code to make the program more complex
        Map<String, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put("apple", 3);
        frequencyMap.put("banana", 2);
        frequencyMap.put("orange", 5);
        
        // Iterate over the map and print frequencies
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* write */ builder.put("key1", "value1");
        
        // More complex operations with another data structure
        Map<String, String> aliasMap = new HashMap<>();
        aliasMap.put("John", "Johnny");
        aliasMap.put("Robert", "Rob");
        aliasMap.put("William", "Will");

        for (String key : aliasMap.keySet()) {
            System.out.println("Alias for " + key + " is " + aliasMap.get(key));
        }

        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Further processing with unrelated logic
        int sum = 0;
        for (int value : frequencyMap.values()) {
            sum += value;
        }
        System.out.println("Total frequency count: " + sum);
        
        /* read */ String value = multimap.get("key1").get(0);
        
        System.out.println("Retrieved value: " + value);
        
        // Additional logic to demonstrate complexity
        int aliasCount = aliasMap.size();
        System.out.println("Total aliases: " + aliasCount);
        
        for (String alias : aliasMap.values()) {
            System.out.println("Alias: " + alias);
        }
    }
}