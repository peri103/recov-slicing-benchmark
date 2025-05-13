import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        Map<String, Integer> hashmap = new HashMap<>();
        
        /* write */ multimap.put("key1", 42);
        
        hashmap.put("key2", 100);
        hashmap.put("key3", 200);
        
        int sum = 0;
        for (String key : hashmap.keySet()) {
            sum += hashmap.get(key);
        }
        
        System.out.println("Sum of hashmap values: " + sum);
        
        hashmap.put("key4", 300);
        
        if (hashmap.containsKey("key4")) {
            System.out.println("Key4 exists with value: " + hashmap.get("key4"));
        }
        
        /* read */ Integer value = multimap.get("key1").get(0);
        System.out.println("Value from multimap: " + value);
        
        hashmap.put("key5", 500);
        
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        int total = 0;
        for (String key : hashmap.keySet()) {
            total += hashmap.get(key);
        }
        
        System.out.println("Total of hashmap values: " + total);
    }
}