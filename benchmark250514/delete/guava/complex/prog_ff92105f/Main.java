import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        Map<String, Integer> extraMap = new HashMap<>();
        
        // Adding some entries to the extraMap
        extraMap.put("extraKey1", 200);
        extraMap.put("extraKey2", 300);

        // Perform some operations with extraMap
        for (Map.Entry<String, Integer> entry : extraMap.entrySet()) {
            System.out.println("Extra map key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        // Add an entry to the LinkedHashBiMap
        /* write */ map.put("key", 100);

        // More complex operations with LinkedHashBiMap
        map.put("anotherKey", 400);
        Integer anotherValue = map.get("anotherKey");
        System.out.println("Another value: " + anotherValue);

        // Iterate over LinkedHashBiMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        // Final retrieval from the original map
        /* read */ int value = map.get("key");
        System.out.println("Retrieved value: " + value);

        // Add more operations to increase complexity
        LinkedHashBiMap<String, String> stringMap = LinkedHashBiMap.create();
        stringMap.put("firstName", "John");
        stringMap.put("lastName", "Doe");

        for (String key : stringMap.keySet()) {
            System.out.println("String map key: " + key + ", value: " + stringMap.get(key));
        }
    }
}