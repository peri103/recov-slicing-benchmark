import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> bidiMap = new DualHashBidiMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        
        // Using a simple map to store some values
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        
        // Perform some operations on the simple map
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        /* write */ bidiMap.put("key", 100);
        
        // Additional operations on the bidiMap
        bidiMap.put("anotherKey", 200);
        bidiMap.put("thirdKey", 300);
        bidiMap.remove("anotherKey");
        
        // Using the bidiMap in a different context
        if (bidiMap.containsKey("thirdKey")) {
            System.out.println("thirdKey exists in bidiMap.");
        }
        
        // Other unrelated logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);
        
        /* read */ int value = bidiMap.get("key");
        System.out.println(value);
        
        // Final operations on the simple map
        simpleMap.put("C", "Cherry");
        for (String key : simpleMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + simpleMap.get(key));
        }
    }
}