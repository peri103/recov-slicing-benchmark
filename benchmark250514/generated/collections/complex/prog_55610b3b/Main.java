import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(1000); // Expiry time set to 1000 milliseconds
        Map<String, Integer> counterMap = new HashMap<>();
        
        // Adding some initial data to the counterMap
        counterMap.put("apple", 5);
        counterMap.put("banana", 3);
        counterMap.put("orange", 10);
        
        // Incrementing the count of bananas
        if (counterMap.containsKey("banana")) {
            counterMap.put("banana", counterMap.get("banana") + 1);
        }
        
        // An unrelated computation
        int sum = 0;
        for (int value : counterMap.values()) {
            sum += value;
        }
        
        System.out.println("Total count of fruits: " + sum);
        
        /* write */ map.put("key", "value");
        
        // Simulate some operations
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                map.put("tempKey" + i, "tempValue" + i);
            } else {
                map.remove("tempKey" + (i - 1));
            }
        }
        
        String result = "";
        // Use values from the map for a condition
        if (map.containsKey("key")) {
            result = map.get("key");
        }
        
        /* read */ String value = map.get("key");
        System.out.println("Retrieved value from map: " + value);
        
        // Further operations with counterMap
        counterMap.put("grape", 7);
        counterMap.put("apple", counterMap.get("apple") + 2);
        
        for (Map.Entry<String, Integer> entry : counterMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}