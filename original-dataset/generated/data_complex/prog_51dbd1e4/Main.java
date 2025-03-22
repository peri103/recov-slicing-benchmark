import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Add elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Iterate over the list and print elements
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Iterate over the map and print key-value pairs
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Perform some additional operations
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // Add more elements to the set
        set.add(2);
        set.add(3);

        /* write */ set.add(1);

        // Perform a complex operation
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add("even" + i);
            } else {
                list.add("odd" + i);
            }
        }

        // Further operations on the list
        for (String item : list) {
            if (item.contains("even")) {
                System.out.println("Even item: " + item);
            }
        }

        // Check if the set contains a specific value
        /* read */ boolean containsValue = set.contains(1);
        System.out.println("Set contains 1: " + containsValue);

        // Additional set operations
        if (set.contains(2)) {
            System.out.println("Set contains 2");
        }

        // Final summary print
        System.out.println("Final list size: " + list.size());
        System.out.println("Final map size: " + map.size());
        System.out.println("Final set size: " + set.size());
    }
}