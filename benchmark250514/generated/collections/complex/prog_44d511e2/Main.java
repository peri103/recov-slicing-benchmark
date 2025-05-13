import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashSetValuedHashMap
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();

        // Initialize a simple HashMap for additional complexity
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        
        // Perform some operations on the simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Write to the HashSetValuedHashMap
        /* write */ map.put("key", 42);

        // Add more values to the HashSetValuedHashMap
        map.put("key", 24);
        map.put("anotherKey", 99);

        // Perform some unrelated calculations for complexity
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Read from the HashSetValuedHashMap
        /* read */ Collection<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println("Value from map: " + value);
        }

        // Iterate over all entries in the HashSetValuedHashMap
        for (String key : map.keySet()) {
            Collection<Integer> allValues = map.get(key);
            System.out.println("Values for key '" + key + "': " + allValues);
        }
    }
}