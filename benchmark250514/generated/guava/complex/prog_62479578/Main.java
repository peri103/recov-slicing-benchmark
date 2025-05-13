import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.HashMultiset;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMultiset<String> multiset = ConcurrentHashMultiset.create();
        HashMultiset<String> hashMultiset = HashMultiset.create();
        HashMap<String, Integer> map = new HashMap<>();

        // Adding some elements to hashMultiset
        hashMultiset.add("banana");
        hashMultiset.add("orange", 2);

        // Adding elements to map
        map.put("apple", 5);
        map.put("banana", 3);

        /* write */ multiset.add("apple");

        // Performing operations on hashMultiset
        hashMultiset.add("apple", 2);
        hashMultiset.remove("orange");

        // Performing operations on map
        int appleCount = map.get("apple");
        map.put("apple", appleCount + 1);

        // Iterating over hashMultiset
        for (String fruit : hashMultiset.elementSet()) {
            System.out.println(fruit + ": " + hashMultiset.count(fruit));
        }

        // Iterating over map
        for (String fruit : map.keySet()) {
            System.out.println(fruit + ": " + map.get(fruit));
        }

        /* read */ int count = multiset.count("apple");
        System.out.println("Count of 'apple' in ConcurrentHashMultiset: " + count);

        // Performing additional operations on multiset
        multiset.add("banana", 3);
        multiset.remove("apple");

        // Final iteration over multiset
        for (String fruit : multiset.elementSet()) {
            System.out.println(fruit + ": " + multiset.count(fruit));
        }
    }
}