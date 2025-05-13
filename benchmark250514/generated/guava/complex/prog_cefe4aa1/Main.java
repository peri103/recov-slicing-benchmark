import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initializing a builder for ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Creating a HashMap to demonstrate additional operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Performing operations on the HashMap
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);
        
        // Using ImmutableSet to demonstrate additional complexity
        ImmutableSet<String> immutableSet = ImmutableSet.of("A", "B", "C");
        for (String element : immutableSet) {
            System.out.println("Element in immutableSet: " + element);
        }
        
        // Write operation using ImmutableMap builder
        /* write */ builder.put("key", "value");
        
        // Additional unrelated operations
        int product = 1;
        for (Integer value : hashMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in hashMap: " + product);
        
        // Building the ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Read operation from ImmutableMap
        /* read */ String value = map.get("key");
        System.out.println("Value from ImmutableMap: " + value);
        
        // Additional operations with ImmutableMap
        String defaultValue = map.getOrDefault("missingKey", "default");
        System.out.println("Default value for missingKey: " + defaultValue);
    }
}