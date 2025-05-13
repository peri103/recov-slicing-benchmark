import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = new TransformedMultiValuedMap<>(map, null, null);
        
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "John");
        simpleMap.put("city", "New York");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ transformedMap.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);
        
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        
        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* read */ Integer value = transformedMap.get("key").iterator().next();
        
        System.out.println("Value from transformedMap: " + value);
        
        MultiValuedMap<String, String> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        anotherMap.put("vegetable", "carrot");
        
        for (String key : anotherMap.keySet()) {
            System.out.println(key + ": " + anotherMap.get(key));
        }
    }
}