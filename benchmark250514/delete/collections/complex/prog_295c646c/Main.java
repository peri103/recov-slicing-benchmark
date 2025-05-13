import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeValuedHashMap
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();

        // Initialize a HashMap for additional operations
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Initialize an ArrayList and perform operations
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Shuffle the list
        Collections.shuffle(list);

        // Write a value to the TreeValuedHashMap
        /* write */ map.put("key", 42);

        // Perform some operations on the HashMap
        String name = hashMap.get("name");
        String city = hashMap.get("city");
        System.out.println("Name: " + name + ", City: " + city);

        // Sort the list
        Collections.sort(list);

        // Print the sorted list
        System.out.println("Sorted list: " + list);

        // Read the value from the TreeValuedHashMap
        /* read */ Integer value = map.get("key").iterator().next();

        // Print the value
        System.out.println("Value from TreeValuedHashMap: " + value);

        // Perform operations on the list after reading the map
        for (Integer num : list) {
            System.out.println("List item: " + num);
        }

        // Add more values to the HashMap and print them
        hashMap.put("country", "Fantasyland");
        System.out.println("Country: " + hashMap.get("country"));
    }
}