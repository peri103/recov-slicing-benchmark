import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        /* write */ map.put("key1", 100);
        
        // Additional code for complexity
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");
        
        // Perform some operations on stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // More operations
        LinkedHashBiMap<String, String> map2 = LinkedHashBiMap.create();
        map2.put("a", "apple");
        map2.put("b", "banana");
        
        // Retrieve and print values from map2
        for (String key : map2.keySet()) {
            System.out.println("Map2 Key: " + key + ", Value: " + map2.get(key));
        }
        
        // More unrelated code
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Original read operation, far from the write
        /* read */ Integer value = map.get("key1");
        System.out.println("Value from map: " + value);
    }
}