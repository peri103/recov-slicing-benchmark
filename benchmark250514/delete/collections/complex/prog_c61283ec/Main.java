import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new MultiValueMap<>();
        
        // Wrap it in an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Initialize a HashMap for additional complexity
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Populate the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        
        // Perform some operations on the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Use the modifiable map to write to the UnmodifiableMultiValuedMap
        /* write */ modifiableMap.put("key", "value");
        
        // Perform some operations on the HashMap
        if (hashMap.containsKey(2)) {
            hashMap.put(4, "Four");
        }
        
        // Another unrelated operation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read from the UnmodifiableMultiValuedMap
        /* read */ String value = map.get("key").iterator().next();
        
        // Print the read value
        System.out.println(value);
        
        // Additional operations on the HashMap
        hashMap.remove(1);
        
        // Print final state of the HashMap
        System.out.println("Final HashMap: " + hashMap);
    }
}