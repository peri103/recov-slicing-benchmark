import org.apache.commons.collections4.map.AbstractIterableMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractIterableMap<String, Integer> map = new HashMap<>();
        List<String> keys = new ArrayList<>();
        
        /* write */ map.put("key", 42);
        
        // Adding more complexity
        for (int i = 0; i < 5; i++) {
            String key = "key" + i;
            map.put(key, i * 10);
            keys.add(key);
        }
        
        int sum = 0;
        for (String key : keys) {
            sum += map.get(key);
        }
        
        // Perform some operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        
        // Output intermediate results
        System.out.println("Sum of values: " + sum);
        System.out.println("Product of first three integers: " + product);
        
        /* read */ int value = map.get("key");
        System.out.println(value);
        
        // More operations
        List<Integer> values = new ArrayList<>();
        for (String key : keys) {
            values.add(map.get(key));
        }
        
        for (Integer val : values) {
            System.out.println("Value: " + val);
        }
    }
}