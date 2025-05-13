import org.apache.commons.collections4.set.ListOrderedSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new java.util.LinkedHashSet<>());
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add some numbers to the ArrayList
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        // Add some entries to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        /* write */ set.add("Hello, World!");

        // Iterate over the ArrayList and print numbers
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Iterate over the HashMap and print key-value pairs
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Perform some operations on the set
        set.add("Another String");
        set.add("Yet Another String");

        // Print the entire set
        System.out.println("Set Contents: " + set);

        /* read */ String value = set.get(0);
        System.out.println("Read from set: " + value);

        // Additional operations
        set.remove("Another String");
        System.out.println("Set after removal: " + set);

        // More complex operations
        numbers.clear();
        map.clear();

        for (int i = 6; i <= 10; i++) {
            numbers.add(i * 10);
        }

        map.put("Four", 4);
        map.put("Five", 5);

        System.out.println("Updated numbers: " + numbers);
        System.out.println("Updated map: " + map);
    }
}