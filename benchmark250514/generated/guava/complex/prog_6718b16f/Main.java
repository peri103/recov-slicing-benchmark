import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        Map<String, Set<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        // Add some values to the set
        for (int i = 0; i < 5; i++) {
            set.add(i * 10);
        }
        map.put("setKey", set);

        // Iterate over the set and add to multimap
        for (Integer num : set) {
            multimap.put("numbers", num);
        }

        /* write */ multimap.put("key", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (Integer num : multimap.get("numbers")) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More unrelated operations
        int product = 1;
        for (Integer num : map.get("setKey")) {
            product *= num;
        }
        System.out.println("Product of set numbers: " + product);

        /* read */ Integer value = multimap.get("key").get(0);

        System.out.println("Value from multimap: " + value);

        // Final operations
        int finalSum = sum + value;
        System.out.println("Final sum with value: " + finalSum);
    }
}