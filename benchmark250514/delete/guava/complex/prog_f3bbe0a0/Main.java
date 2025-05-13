import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        Map<String, String> stringMap = new HashMap<>();

        // Using the stringMap to store some values
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");

        // Performing some operations on stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add more entries to map
        map.put("key1", 200);
        map.put("key2", 300);

        /* write */ map.put("key", 100);

        // Perform some unrelated operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            stringMap.put("C" + i, "Value" + i);
        }

        // Print the updated stringMap
        for (String key : stringMap.keySet()) {
            System.out.println("Updated Key: " + key + ", Value: " + stringMap.get(key));
        }

        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Further operations on map
        map.put("key3", 400);
        map.put("key4", 500);

        int maxValue = Integer.MIN_VALUE;
        for (Integer val : map.values()) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        System.out.println("Max value in map: " + maxValue);
    }
}