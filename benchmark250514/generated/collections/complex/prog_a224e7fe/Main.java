import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap with weak keys and weak values
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.WEAK, AbstractReferenceMap.ReferenceStrength.WEAK);
        
        // Initialize a HashMap for additional complexity
        Map<String, String> hashMap = new HashMap<>();
        
        // Add some values to the hashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");
        
        // Write a value into the ReferenceMap
        /* write */ map.put("key", 42);
        
        // Perform operations on the hashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Modify the hashMap
        hashMap.put("D", "Date");
        hashMap.remove("B");
        
        // Print the modified hashMap
        System.out.println("Modified HashMap: " + hashMap);
        
        // Read the value from the ReferenceMap
        /* read */ Integer value = map.get("key");
        
        // Print the value read from the ReferenceMap
        System.out.println("Value from ReferenceMap: " + value);
        
        // Further operations on the hashMap
        hashMap.put("E", "Elderberry");
        System.out.println("Final HashMap: " + hashMap);
        
        // Additional ReferenceMap operations
        map.put("anotherKey", 84);
        System.out.println("Another value from ReferenceMap: " + map.get("anotherKey"));
    }
}