import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = new TransformedMultiValuedMap<>(map, i -> i * 2, i -> i / 2);

        /* write */ transformedMap.put("key", 10);

        // Additional logic using MultiKeyMap
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();
        multiKeyMap.put("key1", "subkey1", 100);
        multiKeyMap.put("key1", "subkey2", 200);
        multiKeyMap.put("key2", "subkey1", 300);

        int sum = 0;
        for (String key : multiKeyMap.keySet()) {
            for (String subkey : multiKeyMap.get(key).keySet()) {
                sum += multiKeyMap.get(key, subkey);
            }
        }
        System.out.println("Sum of MultiKeyMap values: " + sum);

        // Unrelated code with HashMap
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("age", "30");
        simpleMap.put("city", "Wonderland");

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            builder.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }
        System.out.println("SimpleMap details: " + builder.toString());

        /* read */ Integer value = transformedMap.get("key").iterator().next();
        System.out.println(value);

        // Additional logic to manipulate and print transformedMap values
        transformedMap.put("key", 20);
        transformedMap.put("key", 30);
        int transformedSum = 0;
        for (Integer val : transformedMap.get("key")) {
            transformedSum += val;
        }
        System.out.println("Sum of transformedMap values: " + transformedSum);
    }
}