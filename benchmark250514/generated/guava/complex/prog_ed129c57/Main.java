import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original SetMultimap usage
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        /* write */ multimap.put("key", 42);

        // Additional complex logic
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("alpha", 1);
        hashMap.put("beta", 2);
        hashMap.put("gamma", 3);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // More operations with multimap
        multimap.put("anotherKey", 100);
        multimap.put("key", 43);
        multimap.put("key", 44);

        // Additional operations with the hashMap
        hashMap.put("delta", 4);
        hashMap.remove("beta");

        int product = 1;
        for (Integer value : hashMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in hashMap: " + product);

        // Reading the original multimap value
        /* read */ Set<Integer> values = multimap.get("key");
        System.out.println("Values associated with 'key' in multimap: " + values);

        // Further operations
        multimap.put("key", 45);
        Set<Integer> anotherValues = multimap.get("anotherKey");
        System.out.println("Values associated with 'anotherKey' in multimap: " + anotherValues);
    }
}