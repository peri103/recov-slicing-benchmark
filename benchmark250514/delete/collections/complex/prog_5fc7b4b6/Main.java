import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = new TransformedMultiValuedMap<>(multiValuedMap, null, null);
        
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("greet", "Hello");
        simpleMap.put("farewell", "Goodbye");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* write */ transformedMap.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("apples", 3);
        countMap.put("bananas", 5);
        
        int totalFruits = 0;
        for (Integer count : countMap.values()) {
            totalFruits += count;
        }
        System.out.println("Total fruits: " + totalFruits);
        
        /* read */ Integer value = transformedMap.get("key").iterator().next();
        
        System.out.println("Retrieved value from transformedMap: " + value);
        
        MultiValuedMap<String, String> anotherMultiValuedMap = new MultiValueMap<>();
        anotherMultiValuedMap.put("colors", "red");
        anotherMultiValuedMap.put("colors", "blue");
        
        for (String color : anotherMultiValuedMap.get("colors")) {
            System.out.println("Color: " + color);
        }
    }
}