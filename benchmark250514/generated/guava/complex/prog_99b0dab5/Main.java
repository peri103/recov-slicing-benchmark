import com.google.common.collect.SetMultimap;
import com.google.common.collect.HashMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        Map<String, Integer> regularMap = new HashMap<>();
        
        regularMap.put("anotherKey", 100);
        regularMap.put("yetAnotherKey", 200);
        
        /* write */ multimap.put("key", 42);
        
        for (Map.Entry<String, Integer> entry : regularMap.entrySet()) {
            System.out.println("Regular map entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        SetMultimap<String, Integer> anotherMultimap = HashMultimap.create();
        anotherMultimap.put("key", 84);
        anotherMultimap.put("key", 126);
        
        int sum = 0;
        for (Integer value : anotherMultimap.get("key")) {
            sum += value;
        }
        System.out.println("Sum of values in anotherMultimap: " + sum);
        
        /* read */ Set<Integer> values = multimap.get("key");
        
        for (Integer value : values) {
            System.out.println("Original multimap value: " + value);
        }
        
        SetMultimap<String, Integer> combinedMultimap = HashMultimap.create();
        combinedMultimap.putAll(multimap);
        combinedMultimap.putAll(anotherMultimap);
        
        for (String key : combinedMultimap.keySet()) {
            System.out.println("Combined multimap key: " + key);
            for (Integer value : combinedMultimap.get(key)) {
                System.out.println("Combined multimap value: " + value);
            }
        }
    }
}