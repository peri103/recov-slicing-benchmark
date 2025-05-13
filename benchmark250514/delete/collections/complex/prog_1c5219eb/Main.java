import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.TreeBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractOrderedBidiMapDecorator with a TreeBidiMap
        AbstractOrderedBidiMapDecorator<String, Integer> bidiMap = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());

        // Initialize a HashMap for unrelated operations
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");

        // Perform some operations on the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add more entries to the HashMap
        hashMap.put("C", "Cherry");
        hashMap.put("D", "Date");

        // Perform a search in the HashMap
        String fruit = hashMap.get("C");
        System.out.println("Retrieved fruit: " + fruit);

        /* write */ bidiMap.put("key1", 100);

        // Perform additional operations on the bidiMap
        bidiMap.put("key2", 200);
        bidiMap.put("key3", 300);
        System.out.println("Keys in bidiMap: " + bidiMap.keySet());

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // Use a loop to iterate over the bidiMap
        for (String key : bidiMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + bidiMap.get(key));
        }

        /* read */ Integer value = bidiMap.get("key1");

        System.out.println("Value retrieved from bidiMap: " + value);

        // Perform a final operation on the HashMap
        hashMap.remove("B");
        System.out.println("HashMap after removal: " + hashMap);
    }
}