import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        
        // Adding some unrelated operations
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        simpleMap.put("C", "Cherry");
        
        String fruit = simpleMap.get("B");
        System.out.println("Fruit from simpleMap: " + fruit);
        
        // Adding more elements to simpleMap
        for (char c = 'D'; c <= 'F'; c++) {
            simpleMap.put(String.valueOf(c), "Fruit" + c);
        }
        
        // Print all elements in simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* write */ multiKeyMap.put("key1", "key2", 42);
        
        // Additional unrelated logic
        MultiKeyMap<String, String> multiKeyMapString = new MultiKeyMap<>();
        multiKeyMapString.put("alpha", "beta", "value1");
        multiKeyMapString.put("gamma", "delta", "value2");
        
        String val1 = multiKeyMapString.get("alpha", "beta");
        String val2 = multiKeyMapString.get("gamma", "delta");
        
        System.out.println("Value from multiKeyMapString: " + val1);
        System.out.println("Value from multiKeyMapString: " + val2);
        
        // Performing operations on multiKeyMapString
        multiKeyMapString.put("epsilon", "zeta", "value3");
        for (String key : multiKeyMapString.keySet()) {
            System.out.println("Key: " + key + ", Value: " + multiKeyMapString.get(key));
        }
        
        /* read */ int value = multiKeyMap.get("key1", "key2");
        
        System.out.println("Value from multiKeyMap: " + value);
        
        // Further operations with multiKeyMap
        multiKeyMap.put("key3", "key4", 100);
        multiKeyMap.put("key5", "key6", 200);
        
        int val3 = multiKeyMap.get("key3", "key4");
        int val4 = multiKeyMap.get("key5", "key6");
        
        System.out.println("Additional values from multiKeyMap: " + val3 + ", " + val4);
    }
}