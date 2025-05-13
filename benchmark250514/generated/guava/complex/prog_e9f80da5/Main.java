import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BiMap<String, Integer> biMap = HashBiMap.create();
        
        // Unrelated complex operations
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* write */ biMap.put("key", 42);
        
        // More operations with BiMap
        biMap.put("anotherKey", 100);
        System.out.println("Another key value: " + biMap.get("anotherKey"));
        
        // Even more unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        /* read */ Integer value = biMap.get("key");
        System.out.println(value);
        
        // Additional operations with the BiMap
        BiMap<Integer, String> inverseMap = biMap.inverse();
        System.out.println("Inverse map key for value 42: " + inverseMap.get(42));
        
        // Final unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}