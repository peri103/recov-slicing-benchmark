import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key2", 100);
        
        // Initialize another MultiValueMap
        MultiValueMap<String, Integer> multiValueMap2 = new MultiValueMap<>();
        multiValueMap2.put("key3", 200);
        multiValueMap2.put("key4", 300);

        /* write */ multiValueMap.put("key1", "value1");

        // Perform operations on hashMap
        int x = hashMap.get("key2");
        System.out.println("Value from hashMap: " + x);
        
        // Perform operations on multiValueMap2
        for (String key : multiValueMap2.keySet()) {
            System.out.println("Key: " + key + ", Value: " + multiValueMap2.get(key).iterator().next());
        }

        // More unrelated operations
        int sum = 0;
        for (Integer value : multiValueMap2.get("key3")) {
            sum += value;
        }
        System.out.println("Sum of values for key3: " + sum);

        /* read */ String value = (String) multiValueMap.get("key1").iterator().next();
        System.out.println("Value from multiValueMap: " + value);

        // Additional operations
        hashMap.put("key5", 500);
        int y = hashMap.get("key5");
        System.out.println("New value from hashMap: " + y);
    }
}