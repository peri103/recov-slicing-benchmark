import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding elements to the map
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        
        // Iterating over the map and adding values to the set
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            set.add(entry.getValue() * 10);
        }
        
        // Additional operations with the set
        set.add(100);
        set.add(200);
        
        // Performing a complex calculation
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        
        System.out.println("Sum of elements in the set: " + sum);
        
        /* write */ set.add(42);
        
        // Performing operations unrelated to the TreeSet
        int product = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            product *= entry.getValue();
        }
        
        System.out.println("Product of map values: " + product);
        
        /* read */ boolean containsValue = set.contains(42);
        System.out.println(containsValue);
        
        // Additional logic to manipulate the map
        map.put("fourth", product);
        map.remove("third");
        
        // Displaying the map contents
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}