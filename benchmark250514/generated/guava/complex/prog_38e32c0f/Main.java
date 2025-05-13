import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        map.put("anotherKey", 100);
        
        /* write */ multimap.put("key", 42);
        
        for (int i = 0; i < 5; i++) {
            multimap.put("key" + i, i * 10);
        }
        
        Integer sum = 0;
        for (int i = 0; i < multimap.get("key").size(); i++) {
            sum += multimap.get("key").get(i);
        }
        
        map.put("sumKey", sum);
        
        System.out.println("Sum of values in multimap under 'key': " + map.get("sumKey"));
        
        Integer value = map.get("anotherKey");
        System.out.println("Value from map with 'anotherKey': " + value);
        
        /* read */ Integer retrievedValue = multimap.get("key").get(0);
        System.out.println("Retrieved value from multimap: " + retrievedValue);
        
        for (String key : map.keySet()) {
            System.out.println("Map contains key: " + key + " with value: " + map.get(key));
        }
        
        for (String key : multimap.keySet()) {
            System.out.println("Multimap contains key: " + key + " with values: " + multimap.get(key));
        }
    }
}