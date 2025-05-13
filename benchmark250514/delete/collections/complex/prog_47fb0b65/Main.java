import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(
            multiValuedMap, 
            key -> key, 
            value -> value
        );

        // Additional code for complexity
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("simpleKey", 100);
        System.out.println("SimpleMap Value: " + simpleMap.get("simpleKey"));
        
        transformedMap.put("anotherKey", 84);
        transformedMap.put("yetAnotherKey", 168);

        // Performing operations on simpleMap
        simpleMap.put("additionalKey", 200);
        simpleMap.put("anotherSimpleKey", 300);
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ transformedMap.put("key1", 42);

        // More operations on transformedMap
        transformedMap.put("key2", 56);
        transformedMap.put("key3", 72);
        for (String key : transformedMap.keySet()) {
            System.out.println("TransformedMap Key: " + key + ", Values: " + transformedMap.get(key));
        }

        /* read */ Integer value = transformedMap.get("key1").iterator().next();
        System.out.println(value);

        // Final operations on simpleMap
        simpleMap.put("finalKey", 400);
        simpleMap.put("lastSimpleKey", 500);
        for (String key : simpleMap.keySet()) {
            System.out.println("Final SimpleMap Key: " + key + ", Value: " + simpleMap.get(key));
        }
    }
}