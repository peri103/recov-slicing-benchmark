import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap it in an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Additional unrelated map to increase complexity
        Map<String, Integer> unrelatedMap = new HashMap<>();
        unrelatedMap.put("unrelatedKey1", 100);
        unrelatedMap.put("unrelatedKey2", 200);
        
        // Perform some operations on the unrelated map
        for (Map.Entry<String, Integer> entry : unrelatedMap.entrySet()) {
            System.out.println("Unrelated Map Entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        // Since UnmodifiableMultiValuedMap does not allow direct modification,
        // we need to modify the underlying modifiable map
        /* write */ modifiableMap.put("key", "value");
        
        // Perform some additional operations on the modifiable map
        modifiableMap.put("anotherKey", "anotherValue");
        modifiableMap.put("key", "value2");
        
        // Access the value using the unmodifiable map
        Iterator<String> iterator = map.get("key").iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating over values for 'key': " + iterator.next());
        }
        
        // Access the value using the unmodifiable map
        /* read */ String value = map.get("key").iterator().next();
        
        System.out.println("Read value: " + value);
        
        // More operations to increase complexity
        unrelatedMap.put("unrelatedKey3", 300);
        
        for (Map.Entry<String, Integer> entry : unrelatedMap.entrySet()) {
            if (entry.getValue() > 150) {
                System.out.println("Filtered Unrelated Map Entry: " + entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}