import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiKeyMap
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();

        // Initialize a regular HashMap for additional complexity
        Map<String, String> hashMap = new HashMap<>();

        // Add some entries to the HashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");

        // Perform some operations on the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Write a value to the MultiKeyMap using multiple keys
        /* write */ multiKeyMap.put("key1", "key2", 42);

        // Add more entries to the MultiKeyMap
        multiKeyMap.put("key3", "key4", 84);
        multiKeyMap.put("key5", "key6", 126);

        // Perform some operations on the MultiKeyMap
        for (String key1 : new String[]{"key1", "key3", "key5"}) {
            for (String key2 : new String[]{"key2", "key4", "key6"}) {
                Integer value = multiKeyMap.get(key1, key2);
                if (value != null) {
                    System.out.println("MultiKeyMap: " + key1 + ", " + key2 + " -> " + value);
                }
            }
        }

        // Read the value using the original keys
        /* read */ Integer value = multiKeyMap.get("key1", "key2");

        // Print the value to ensure it was read correctly
        System.out.println("Read value: " + value);

        // Perform some operations on the read value
        int calculatedValue = value * 2;
        System.out.println("Calculated value: " + calculatedValue);

        // Additional operations on the HashMap for complexity
        hashMap.put("C", "Cherry");
        System.out.println("HashMap size: " + hashMap.size());
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}