import com.google.common.collect.TreeMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<String> multiset = TreeMultiset.create();
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the map
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);

        // Iterating over the map and adding elements to the multiset
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String fruit = entry.getKey();
            int quantity = entry.getValue();
            for (int i = 0; i < quantity; i++) {
                multiset.add(fruit);
            }
        }

        // Adding an additional element to the multiset
        /* write */ multiset.add("example");

        // Performing some operations with the map
        map.put("grape", 4);
        map.remove("banana");

        // Calculating total number of fruits in the multiset
        int totalFruits = 0;
        for (String fruit : multiset.elementSet()) {
            totalFruits += multiset.count(fruit);
        }

        // Printing out the total number of fruits
        System.out.println("Total number of fruits: " + totalFruits);

        // Checking the count of a specific element
        /* read */ int count = multiset.count("example");

        // Printing out the count of the specific element
        System.out.println("Count of 'example': " + count);

        // Further operations with the map
        map.put("kiwi", 6);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}