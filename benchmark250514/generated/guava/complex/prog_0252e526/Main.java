import com.google.common.collect.LinkedHashMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        HashMap<String, Integer> map = new HashMap<>();
        
        /* write */ multimap.put("key1", "value1");
        
        // Unrelated complex operation
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);

        // Another LinkedHashMultimap operation
        multimap.put("key2", "value2");
        multimap.put("key3", "value3");

        // Iterate over the multimap
        for (String key : multimap.keySet()) {
            System.out.println("Values for " + key + ": " + multimap.get(key));
        }

        // Perform some calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 3: " + product);

        /* read */ String value = multimap.get("key1").iterator().next();
        
        System.out.println(value);
    }
}