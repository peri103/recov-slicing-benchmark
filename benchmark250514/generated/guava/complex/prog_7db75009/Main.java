import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> baseMap = new TreeMap<>();
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected SortedMap<String, Integer> delegate() {
                return baseMap;
            }
        };
        
        /* write */ map.put("key", 42);

        // Additional unrelated code for complexity
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John");
        hashMap.put("age", "30");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        SortedMap<String, String> anotherMap = new TreeMap<>();
        anotherMap.put("apple", "fruit");
        anotherMap.put("carrot", "vegetable");
        
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " is a " + entry.getValue());
        }

        // Operations on the original map
        map.put("anotherKey", 100);
        int anotherValue = map.get("anotherKey");
        System.out.println("Another value: " + anotherValue);

        /* read */ int value = map.get("key");
        
        System.out.println("Original value: " + value);
    }
}