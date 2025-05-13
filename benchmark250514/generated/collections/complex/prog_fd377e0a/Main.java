import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map with a default expiration time of 10 seconds for each entry
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(10));
        
        // Another map to demonstrate more complexity
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("A", 1);
        additionalMap.put("B", 2);
        
        // Perform operations on the additional map
        int sum = 0;
        for (Integer value : additionalMap.values()) {
            sum += value;
        }
        
        System.out.println("Sum of values in additionalMap: " + sum);

        // Add more complex logic with conditions
        if (sum > 0) {
            additionalMap.put("C", 3);
        }
        
        // Iterate and print keys and values from additionalMap
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        /* write */ map.put("key", "value");
        
        // More operations on additionalMap
        additionalMap.put("D", 4);
        additionalMap.remove("A");
        
        // Print updated additionalMap
        System.out.println("Updated additionalMap: " + additionalMap);

        // More complex logic with map
        if (!additionalMap.containsKey("E")) {
            additionalMap.put("E", 5);
        }
        
        /* read */ String value = map.get("key");
        
        System.out.println(value);
        
        // Final operations on additionalMap
        additionalMap.put("F", 6);
        int product = 1;
        for (Integer val : additionalMap.values()) {
            product *= val;
        }
        
        System.out.println("Product of values in additionalMap: " + product);
    }
}