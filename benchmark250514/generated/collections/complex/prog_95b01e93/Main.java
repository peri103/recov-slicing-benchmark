import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        HashMap<String, String> simpleMap = new HashMap<>();
        
        // Unrelated code to make the program more complex
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        
        Set<String> keys = simpleMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + simpleMap.get(key));
        }
        
        simpleMap.put("C", "Cherry");
        
        // Similar API usage without marking with /* write */ or /* read */
        map.put("key2", 100);
        Collection<Integer> values2 = map.get("key2");
        for (Integer value : values2) {
            System.out.println("Value from key2: " + value);
        }
        
        // Original write-read pair
        /* write */ map.put("key1", 42);
        
        // More unrelated code
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Original read
        /* read */ Collection<Integer> values = map.get("key1");
        for (Integer value : values) {
            System.out.println("Value from key1: " + value);
        }
        
        // Further complexity
        for (int i = 0; i < 5; i++) {
            map.put("key" + (i + 3), i * 20);
        }
        
        Collection<Integer> values3 = map.get("key3");
        for (Integer value : values3) {
            System.out.println("Value from key3: " + value);
        }
    }
}