import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BiMap<String, Integer> biMap = HashBiMap.create();
        Map<String, String> simpleMap = new HashMap<>();
        
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        
        for (String key : simpleMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + simpleMap.get(key));
        }
        
        /* write */ biMap.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        BiMap<String, Integer> anotherBiMap = HashBiMap.create();
        anotherBiMap.put("x", 100);
        anotherBiMap.put("y", 200);
        
        for (String key : anotherBiMap.keySet()) {
            System.out.println("Another BiMap - Key: " + key + ", Value: " + anotherBiMap.get(key));
        }

        /* read */ int value = biMap.get("key");
        System.out.println("BiMap value for 'key': " + value);
        
        simpleMap.put("C", "Cherry");
        
        for (String key : simpleMap.keySet()) {
            System.out.println("Updated Key: " + key + ", Updated Value: " + simpleMap.get(key));
        }
    }
}