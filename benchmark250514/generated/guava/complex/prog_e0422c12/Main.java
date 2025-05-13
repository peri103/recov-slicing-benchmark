import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, String> multimap = HashMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Additional data structure manipulation
        map.put("item1", 10);
        map.put("item2", 20);
        
        for (int i = 0; i < 5; i++) {
            list.add(i * 5);
        }
        
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list: " + sum);
        
        // Insert into multimap
        /* write */ multimap.put("key1", "value1");
        
        // Further operations on map
        map.put("item3", 30);
        map.put("item4", 40);
        
        int total = 0;
        for (Integer value : map.values()) {
            total += value;
        }
        System.out.println("Total value in map: " + total);
        
        // Additional manipulation of list
        list.add(25);
        list.add(30);
        
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max in list: " + max);
        
        // Retrieve from multimap
        /* read */ Set<String> values = multimap.get("key1");
        
        for (String value : values) {
            System.out.println("Retrieved value from multimap: " + value);
        }
    }
}