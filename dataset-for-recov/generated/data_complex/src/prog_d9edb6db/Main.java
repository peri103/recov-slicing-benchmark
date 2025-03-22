import java.util.concurrent.ConcurrentSkipListSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ConcurrentSkipListSet
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        
        // Initialize an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        // Initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        // Perform operations on the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Add elements to the ConcurrentSkipListSet
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        // Perform operations on the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList Element: " + list.get(i));
        }

        // Add a specific element to the set
        /* write */ set.add(42);

        // Perform some unrelated computation
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Check if the element exists in the set
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Set contains 42: " + containsValue);

        // Additional operation on the ConcurrentSkipListSet
        for (Integer value : set) {
            System.out.println("Set Element: " + value);
        }
    }
}