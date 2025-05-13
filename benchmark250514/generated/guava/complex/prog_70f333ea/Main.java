import com.google.common.collect.HashMultimap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMultimap<String, Integer> multimap = HashMultimap.create();
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        // Using HashMap
        map.put("mapKey1", 100);
        map.put("mapKey2", 200);

        // Using HashSet
        for (int i = 0; i < 5; i++) {
            set.add(i * 10);
        }

        /* write */ multimap.put("key", 42);

        // Process and manipulate the HashMap
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println("HashMap value: " + value);
        }

        // Process and manipulate the HashSet
        for (Integer val : set) {
            System.out.println("HashSet value: " + val);
        }

        // More manipulation with HashMultimap
        multimap.put("key", 84);
        multimap.put("anotherKey", 99);

        // Retrieve and print values from HashMultimap
        Set<Integer> values = multimap.get("key");
        for (Integer val : values) {
            System.out.println("Multimap value: " + val);
        }

        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("Read value: " + value);
    }
}