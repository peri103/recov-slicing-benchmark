import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = HashMultimap.create();
        
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Hello", "World");
        stringMap.put("Java", "Programming");

        // Performing operations on stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ multimap.put("key", 42);
        
        // Additional operations using another HashMultimap
        Multimap<String, String> stringMultimap = HashMultimap.create();
        stringMultimap.put("fruit", "apple");
        stringMultimap.put("fruit", "banana");
        stringMultimap.put("vegetable", "carrot");

        for (String key : stringMultimap.keySet()) {
            System.out.println(key + ": " + stringMultimap.get(key));
        }

        // Some unrelated computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        /* read */ Integer value = multimap.get("key").iterator().next();
        
        System.out.println(value);

        // More unrelated code
        Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put("one", 1);
        integerMap.put("two", 2);
        integerMap.put("three", 3);

        for (String number : integerMap.keySet()) {
            System.out.println(number + ": " + integerMap.get(number));
        }
    }
}