import com.google.common.collect.TreeMultimap;
import com.google.common.collect.HashMultimap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        HashMultimap<String, String> hashMultimap = HashMultimap.create();
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to HashMultimap
        hashMultimap.put("fruit", "apple");
        hashMultimap.put("fruit", "banana");
        hashMultimap.put("fruit", "orange");

        // Adding elements to ArrayList
        list.add("Hello");
        list.add("World");

        // Perform operations on HashMultimap
        if (hashMultimap.containsKey("fruit")) {
            for (String fruit : hashMultimap.get("fruit")) {
                System.out.println("Fruit: " + fruit);
            }
        }

        // Perform operations on ArrayList
        for (String str : list) {
            System.out.println("String from list: " + str);
        }

        // Original TreeMultimap write operation
        /* write */ multimap.put("key", 42);

        // Additional operations on TreeMultimap
        multimap.put("key", 43);
        multimap.put("anotherKey", 100);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Perform operations on TreeMultimap
        if (multimap.containsKey("anotherKey")) {
            System.out.println("anotherKey has value: " + multimap.get("anotherKey").iterator().next());
        }

        // Original TreeMultimap read operation
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("Read value from TreeMultimap: " + value);
    }
}