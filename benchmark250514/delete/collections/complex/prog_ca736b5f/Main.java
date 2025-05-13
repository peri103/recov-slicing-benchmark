import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractBidiMapDecorator with a TreeBidiMap
        AbstractBidiMapDecorator<String, Integer> bidiMap = new AbstractBidiMapDecorator<>(new TreeBidiMap<>());
        
        // Initialize a HashMap for additional complexity
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        
        // Perform operations on HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // Add more entries to the bidiMap
        bidiMap.put("key2", 200);
        bidiMap.put("key3", 300);
        
        /* write */ bidiMap.put("key1", 100);
        
        // Perform a series of operations to increase complexity
        int sum = 0;
        for (Integer value : bidiMap.values()) {
            sum += value;
        }
        System.out.println("Sum of all values in bidiMap: " + sum);
        
        // Manipulate the HashMap further
        hashMap.put("C", "Cherry");
        hashMap.remove("B");
        
        // Display the updated HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Updated HashMap: " + key + " -> " + hashMap.get(key));
        }
        
        /* read */ Integer value = bidiMap.get("key1");
        
        System.out.println("Read value from bidiMap: " + value);
        
        // Additional operations on bidiMap
        bidiMap.remove("key2");
        System.out.println("Size of bidiMap after removal: " + bidiMap.size());
    }
}