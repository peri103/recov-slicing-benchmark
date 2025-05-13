import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AbstractLinkedMap<String, Integer> map = new LinkedMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        LRUMap<String, String> lruMap = new LRUMap<>(3);

        // Adding entries to LRUMap
        lruMap.put("A", "Apple");
        lruMap.put("B", "Banana");
        lruMap.put("C", "Cherry");
        
        // Accessing LRUMap to change the order
        System.out.println("LRUMap Value: " + lruMap.get("A"));
        lruMap.put("D", "Date");

        // Adding entries to HashMap
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Accessing HashMap
        Integer hashValue = hashMap.get("two");
        System.out.println("HashMap Value: " + hashValue);

        // Original write operation
        /* write */ map.put("key", 42);

        // More operations on LRUMap
        lruMap.put("E", "Elderberry");
        System.out.println("LRUMap Value: " + lruMap.get("B"));

        // Additional operations on HashMap
        hashMap.put("three", 3);
        Integer anotherHashValue = hashMap.get("three");
        System.out.println("Another HashMap Value: " + anotherHashValue);

        // Original read operation
        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Further operations on LRUMap
        lruMap.put("F", "Fig");
        System.out.println("LRUMap Value: " + lruMap.get("C"));
    }
}