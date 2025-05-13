import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = new TransformedMultiValuedMap<>(multiValuedMap, null, null);
        
        /* write */ transformedMap.put("key", 42);
        
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        simpleMap.put("age", "25");
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ Integer value = transformedMap.get("key").iterator().next();
        
        System.out.println("TransformedMap value for 'key': " + value);
        
        MultiValuedMap<String, String> multiMap = new MultiValueMap<>();
        multiMap.put("fruit", "apple");
        multiMap.put("fruit", "banana");
        multiMap.put("vegetable", "carrot");
        
        for (String fruit : multiMap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }
        
        for (String vegetable : multiMap.get("vegetable")) {
            System.out.println("Vegetable: " + vegetable);
        }
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}