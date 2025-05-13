import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        Map<String, List<Integer>> map = new HashMap<>();
        
        // Adding some data to another map to make the program more complex
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
            list2.add(i * 2);
        }
        map.put("list1", list1);
        map.put("list2", list2);

        // Iterating and printing the map data
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Values: " + map.get(key));
        }

        // Original write operation
        /* write */ multimap.put("key1", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        System.out.println("Sum of list1: " + sum);

        // More operations
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        System.out.println("Sum of list1 and list2: " + sum);

        // Original read operation
        /* read */ Set<Integer> values = multimap.get("key1");
        System.out.println("Values for key1 in multimap: " + values);

        // Additional operations to increase complexity
        for (int i = 0; i < 3; i++) {
            multimap.put("key2", i * 10);
        }
        Set<Integer> key2Values = multimap.get("key2");
        System.out.println("Values for key2 in multimap: " + key2Values);
    }
}