import com.google.common.collect.LinkedHashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultiset<String> multiset = LinkedHashMultiset.create();
        Map<String, Integer> map = new HashMap<>();

        // Simulate some unrelated operations
        map.put("key1", 10);
        map.put("key2", 20);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        /* write */ multiset.add("example");

        // Perform some calculations
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);

        // More unrelated operations
        if (map.containsKey("key1")) {
            map.put("key1", map.get("key1") + 5);
        }

        // Output modified map
        System.out.println("Modified map: " + map);

        /* read */ int count = multiset.count("example");
        System.out.println(count);

        // Further unrelated operations
        LinkedHashMultiset<Integer> intMultiset = LinkedHashMultiset.create();
        for (int i = 0; i < 5; i++) {
            intMultiset.add(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Count of " + i + ": " + intMultiset.count(i));
        }
    }
}