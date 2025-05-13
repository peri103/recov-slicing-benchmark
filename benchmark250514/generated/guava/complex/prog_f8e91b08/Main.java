import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        Multimap<String, String> stringMultimap = ArrayListMultimap.create();

        // Add elements to the map
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Add elements to the stringMultimap
        stringMultimap.put("group1", "element1");
        stringMultimap.put("group1", "element2");
        stringMultimap.put("group2", "element3");

        // Perform some operations on the map
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // Perform some operations on the stringMultimap
        System.out.println("Elements in group1:");
        for (String element : stringMultimap.get("group1")) {
            System.out.println(element);
        }

        /* write */ multimap.put("key", 42);

        // Perform some operations on multimap
        multimap.put("key", 56);
        multimap.put("anotherKey", 78);

        System.out.println("Values for key:");
        for (Integer val : multimap.get("key")) {
            System.out.println(val);
        }

        // Calculate the sum of all values in multimap
        int totalSum = 0;
        for (String key : multimap.keySet()) {
            for (Integer value : multimap.get(key)) {
                totalSum += value;
            }
        }
        System.out.println("Total sum of values in multimap: " + totalSum);

        /* read */ Integer value = multimap.get("key").get(0);
        System.out.println("Read value: " + value);

        // Perform additional operations
        multimap.put("key", 99);
        multimap.put("anotherKey", 100);

        System.out.println("Updated values for key:");
        for (Integer val : multimap.get("key")) {
            System.out.println(val);
        }
    }
}