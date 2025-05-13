import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractOrderedMapDecorator<String, Integer> map = new AbstractOrderedMapDecorator<>(new HashMap<>());
        
        // Additional complex operations with a different map
        AbstractOrderedMapDecorator<String, String> stringMap = new AbstractOrderedMapDecorator<>(new HashMap<>());
        stringMap.put("first", "Hello");
        stringMap.put("second", "World");
        
        // Manipulate another map
        AbstractOrderedMapDecorator<Integer, String> numberMap = new AbstractOrderedMapDecorator<>(new HashMap<>());
        for (int i = 0; i < 5; i++) {
            numberMap.put(i, "Number " + i);
        }
        
        /* write */ map.put("key", 42);
        
        // Perform operations on numberMap
        for (Map.Entry<Integer, String> entry : numberMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Check contents of stringMap
        System.out.println("String map size: " + stringMap.size());
        
        // More operations on stringMap
        if (stringMap.containsKey("first")) {
            System.out.println("Found key 'first' with value: " + stringMap.get("first"));
        }
        
        // Perform a calculation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        /* read */ Integer value = map.get("key");
        System.out.println(value);
        
        // Final operations
        ListOrderedMap<String, Double> orderedMap = new ListOrderedMap<>();
        orderedMap.put("pi", 3.14159);
        orderedMap.put("e", 2.71828);
        System.out.println("Ordered Map: " + orderedMap);
    }
}