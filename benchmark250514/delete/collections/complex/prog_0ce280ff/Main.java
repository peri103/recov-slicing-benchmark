import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);
        
        /* write */ map.put("key", 42);
        
        // Additional logic using a HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Performing some operations before reading from the original map
        MultiValuedMap<String, String> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        anotherMap.put("fruit", "cherry");
        
        Collection<String> fruits = anotherMap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Reading from the original unmodifiable map
        /* read */ Collection<Integer> values = unmodifiableMap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
        
        // Adding more complexity with arithmetic operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Further operations using the map
        map.put("anotherKey", 84);
        Collection<Integer> anotherValues = unmodifiableMap.get("anotherKey");
        for (Integer val : anotherValues) {
            System.out.println("Another value: " + val);
        }
    }
}