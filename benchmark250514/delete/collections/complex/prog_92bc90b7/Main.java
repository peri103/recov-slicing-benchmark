import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        
        // Additional complex logic
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");

        for (String key : stringMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + stringMap.get(key));
        }

        // More operations on TreeValuedHashMap
        map.put("anotherKey", 100);
        map.put("anotherKey", 200);
        
        System.out.println("Values for 'anotherKey':");
        Collection<Integer> anotherValues = map.get("anotherKey");
        for (Integer value : anotherValues) {
            System.out.println(value);
        }

        // Original write-read pair
        /* write */ map.put("key", 42);
        
        // Additional unrelated computation
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // Read operation far from write
        /* read */ Collection<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println("Value for 'key': " + value);
        }

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 natural numbers: " + product);
    }
}