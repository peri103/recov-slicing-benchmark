import org.apache.commons.collections4.map.LazyMap;
import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(hashMap, () -> 0);
        LRUMap<String, String> lruMap = new LRUMap<>(3);

        /* write */ lazyMap.put("key", 42);

        // Populate LRUMap with some entries
        lruMap.put("A", "Apple");
        lruMap.put("B", "Banana");
        lruMap.put("C", "Cherry");

        // Accessing elements to demonstrate LRU behavior
        System.out.println("LRUMap before accessing: " + lruMap);
        lruMap.get("A");
        lruMap.put("D", "Date");
        System.out.println("LRUMap after accessing A and adding D: " + lruMap);

        // Insert more elements into LazyMap
        lazyMap.put("anotherKey", 100);
        lazyMap.put("yetAnotherKey", 200);

        // Perform some calculations
        int sum = 0;
        for (Map.Entry<String, Integer> entry : lazyMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of LazyMap values: " + sum);

        // Access the value from LazyMap
        /* read */ int value = lazyMap.get("key");

        System.out.println("Read value from LazyMap: " + value);

        // Further interactions with LRUMap
        lruMap.put("E", "Elderberry");
        System.out.println("Final state of LRUMap: " + lruMap);
    }
}