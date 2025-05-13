import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.HashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultiset<String> multiset = LinkedHashMultiset.create();
        HashMultiset<String> anotherMultiset = HashMultiset.create();
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the map
        map.put("banana", 2);
        map.put("orange", 3);

        // Adding elements to anotherMultiset
        anotherMultiset.add("banana");
        anotherMultiset.add("orange", 2);

        /* write */ multiset.add("apple");

        // Performing operations on map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            anotherMultiset.add(entry.getKey(), entry.getValue());
        }

        // Printing counts from anotherMultiset
        System.out.println("Banana count: " + anotherMultiset.count("banana"));
        System.out.println("Orange count: " + anotherMultiset.count("orange"));

        // Adding more elements to multiset
        multiset.add("banana");
        multiset.add("banana");

        // Performing some calculations
        int totalFruitCount = anotherMultiset.size() + multiset.size();
        System.out.println("Total fruit count: " + totalFruitCount);

        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple count: " + appleCount);

        // Adding elements based on conditions
        if (appleCount > 0) {
            multiset.add("grape", 3);
        }

        // Final operations
        System.out.println("Grape count: " + multiset.count("grape"));
    }
}