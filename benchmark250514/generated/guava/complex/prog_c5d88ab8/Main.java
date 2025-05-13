import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        
        /* write */ multimap.put("key", 42);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Multimap<String, String> anotherMultimap = ArrayListMultimap.create();
        anotherMultimap.put("fruit", "apple");
        anotherMultimap.put("fruit", "banana");
        
        for (String fruit : anotherMultimap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }

        /* read */ Integer value = (Integer) multimap.get("key").iterator().next();
        
        System.out.println("Retrieved value: " + value);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
    }
}