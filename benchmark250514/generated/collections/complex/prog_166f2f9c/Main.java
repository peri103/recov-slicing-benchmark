import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<>();
        Map<String, String> stringMap = new HashMap<>();
        
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");
        
        String retrievedString = stringMap.get("hello");
        System.out.println("Retrieved from stringMap: " + retrievedString);

        /* write */ map.put("key1", 42);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        map.put("key2", 100);
        map.put("key3", 200);

        int valueFromKey2 = map.get("key2");
        System.out.println("Value from key2: " + valueFromKey2);

        /* read */ int value = map.get("key1");
        System.out.println("Retrieved from map: " + value);

        // Additional logic using the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}