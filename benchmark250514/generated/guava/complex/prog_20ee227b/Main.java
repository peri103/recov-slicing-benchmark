import com.google.common.collect.TreeMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        HashMap<String, Integer> map = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the map
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        // Adding elements to the TreeSet
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);

        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some operations on the TreeSet
        for (Integer value : treeSet) {
            System.out.println("TreeSet Value: " + value);
        }

        /* write */ multimap.put("key", 42);

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // More operations on the map
        map.put("d", 40);
        map.put("e", 50);

        // More operations on the TreeSet
        treeSet.add(400);
        treeSet.add(500);

        /* read */ Set<Integer> values = multimap.get("key");
        System.out.println("Values from multimap: " + values);

        // Final operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Final Map - Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Final operations on the TreeSet
        for (Integer value : treeSet) {
            System.out.println("Final TreeSet Value: " + value);
        }
    }
}