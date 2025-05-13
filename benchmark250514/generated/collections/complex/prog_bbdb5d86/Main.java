import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> map = new MultiKeyMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        
        // Add some initial data to the hashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        /* write */ map.put("key1", "key2", 42);

        // Perform some operations on hashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add more entries to hashMap
        hashMap.put("D", "Date");
        hashMap.put("E", "Elderberry");

        // Accessing a value from hashMap
        String fruit = hashMap.get("B");
        System.out.println("Fruit with key 'B': " + fruit);

        // Add another entry to the MultiKeyMap
        map.put("key3", "key4", 100);

        // Accessing a value from MultiKeyMap
        Integer anotherValue = map.get("key3", "key4");
        System.out.println("Value for keys ('key3', 'key4'): " + anotherValue);

        // More operations on hashMap
        if (hashMap.containsKey("A")) {
            System.out.println("HashMap contains key 'A'");
        }

        /* read */ int value = map.get("key1", "key2");
        System.out.println("Value for keys ('key1', 'key2'): " + value);

        // Final operations on hashMap
        hashMap.remove("C");
        System.out.println("HashMap size after removal: " + hashMap.size());

        for (String key : hashMap.keySet()) {
            System.out.println("Remaining key: " + key);
        }
    }
}