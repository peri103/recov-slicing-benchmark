import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();
        Map<String, Integer> simpleMap = new HashMap<>();

        // Adding entries to the simple map
        simpleMap.put("A", 1);
        simpleMap.put("B", 2);
        simpleMap.put("C", 3);

        // Iterating over the simple map
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations and store the result
        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Perform operations on the MultiKeyMap
        String keyPart1 = "key1";
        String keyPart2 = "key2";
        
        /* write */ multiKeyMap.put(keyPart1, keyPart2, 42);

        // Add more entries to MultiKeyMap
        multiKeyMap.put("key3", "key4", 100);
        multiKeyMap.put("key5", "key6", 200);

        // Perform some unrelated operations
        int factor = 10;
        int product = sum * factor;
        System.out.println("Product of sum and factor: " + product);

        // Retrieve the value from MultiKeyMap
        /* read */ Integer value = multiKeyMap.get(keyPart1, keyPart2);

        // Print the retrieved value
        System.out.println("Retrieved value: " + value);

        // More operations with MultiKeyMap
        int retrievedValue = multiKeyMap.get("key3", "key4");
        System.out.println("Retrieved value from another key: " + retrievedValue);

        // Calculate the total of all values in the MultiKeyMap
        int total = 0;
        for (String key1 : new String[]{"key1", "key3", "key5"}) {
            for (String key2 : new String[]{"key2", "key4", "key6"}) {
                Integer val = multiKeyMap.get(key1, key2);
                if (val != null) {
                    total += val;
                }
            }
        }
        System.out.println("Total of all values in MultiKeyMap: " + total);
    }
}