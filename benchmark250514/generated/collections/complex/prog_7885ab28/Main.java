import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();
        Map<String, Integer> simpleMap = new HashMap<>();
        
        simpleMap.put("one", 1);
        simpleMap.put("two", 2);
        
        /* write */ multiValueMap.put("key", "value");
        
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("SimpleMap Entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in SimpleMap: " + sum);
        
        // Complex operations on MultiValueMap
        multiValueMap.put("key", "anotherValue");
        multiValueMap.put("anotherKey", "thirdValue");
        
        for (String key : multiValueMap.keySet()) {
            System.out.println("MultiValueMap Key: " + key);
        }
        
        /* read */ Object value = multiValueMap.get("key");
        
        System.out.println("Read value from MultiValueMap: " + value);
        
        // Additional logic
        if (!simpleMap.containsKey("three")) {
            simpleMap.put("three", 3);
        }
        
        System.out.println("Updated SimpleMap: " + simpleMap);
    }
}