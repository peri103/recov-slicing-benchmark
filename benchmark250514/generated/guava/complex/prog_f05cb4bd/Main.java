import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 1);
        
        // Additional complex code
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }

        Map<String, Integer> combinedMap = new HashMap<>(hashMap);
        combinedMap.putAll(map);

        for (String key : combinedMap.keySet()) {
            System.out.println(key + ": " + combinedMap.get(key));
        }

        // Further operations on combinedMap
        if (combinedMap.containsKey("key2")) {
            combinedMap.put("key4", combinedMap.get("key2") + 10);
        }

        int totalSum = 0;
        for (Integer value : combinedMap.values()) {
            totalSum += value;
        }
        System.out.println("Total sum: " + totalSum);

        // More complex operations
        Map<String, Integer> filteredMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : combinedMap.entrySet()) {
            if (entry.getValue() > 2) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }

        for (String key : filteredMap.keySet()) {
            System.out.println("Filtered - " + key + ": " + filteredMap.get(key));
        }

        /* read */ boolean containsKey = map.containsKey("key1");
        System.out.println("Map contains 'key1': " + containsKey);
    }
}