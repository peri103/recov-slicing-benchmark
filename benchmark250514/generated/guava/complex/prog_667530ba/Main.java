import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        HashMap<String, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Put the list into the map
        map.put("numbers", numbers);

        // Perform operations on the map
        for (String key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int num : list) {
                System.out.println("Map value: " + num);
            }
        }

        // Write to the multimap
        /* write */ multimap.put("key", 42);

        // Perform some unrelated calculations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on the multimap
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            for (int value : values) {
                System.out.println("Multimap value: " + value);
            }
        }

        // Read from the multimap
        /* read */ Integer value = multimap.get("key").get(0);
        System.out.println("Read value: " + value);

        // More operations on the list
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
        }

        // Print modified list
        for (int num : numbers) {
            System.out.println("Modified list value: " + num);
        }
    }
}