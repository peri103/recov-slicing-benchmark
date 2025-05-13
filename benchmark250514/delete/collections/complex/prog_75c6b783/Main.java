import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> originalMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(originalMap, 
            key -> key.toUpperCase(), 
            value -> value * 2);

        /* write */ transformedMap.put("key", 10);

        // Intermediate operations
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        simpleMap.put("C", "Cherry");

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Another MultiValuedMap usage
        MultiValuedMap<String, String> anotherMap = new MultiValueMap<>();
        anotherMap.put("Fruit", "Apple");
        anotherMap.put("Fruit", "Banana");
        anotherMap.put("Fruit", "Cherry");

        Collection<String> fruits = anotherMap.get("Fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // More complex logic
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Access the transformed map
        /* read */ Collection<Integer> values = transformedMap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}