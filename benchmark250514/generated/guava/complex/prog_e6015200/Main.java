import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = HashMultimap.create();
        List<Integer> list = new ArrayList<>();
        
        // Add elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Perform some operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
        
        /* write */ multimap.put("key", 42);
        
        // Use another Multimap instance
        Multimap<String, String> multimap2 = HashMultimap.create();
        multimap2.put("name", "Alice");
        multimap2.put("name", "Bob");
        
        // Print values from the second Multimap
        System.out.println("Names: " + multimap2.get("name"));
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("Read value from multimap: " + value);
        
        // More operations on the list
        list.add(50);
        list.add(60);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated list element: " + list.get(i));
        }
    }
}