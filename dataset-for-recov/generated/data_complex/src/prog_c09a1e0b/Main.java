import java.util.TreeSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        // Adding elements to map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Adding elements to list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Performing operations on map
        if (map.containsKey("two")) {
            System.out.println("Map contains key 'two' with value: " + map.get("two"));
        }

        // Performing operations on list
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Write to TreeSet
        /* write */ treeSet.add(42);

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is: " + sum);

        // Read from TreeSet
        /* read */ boolean containsValue = treeSet.contains(42);
        System.out.println("TreeSet contains 42: " + containsValue);

        // More operations on map
        map.put("four", 4);
        System.out.println("Updated map: " + map);

        // More operations on list
        list.add("date");
        System.out.println("Updated list: " + list);
    }
}