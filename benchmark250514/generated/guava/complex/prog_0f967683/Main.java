import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        /* write */ multimap.put("key", "value");

        // Additional unrelated code to increase complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Additional similar api pair operations
        Multimap<String, Integer> intMultimap = LinkedHashMultimap.create();
        intMultimap.put("number", 10);
        intMultimap.put("number", 20);
        
        for (Integer num : intMultimap.get("number")) {
            System.out.println("Multimap value: " + num);
        }

        // Some more unrelated code
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Read from the original write-read pair
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}