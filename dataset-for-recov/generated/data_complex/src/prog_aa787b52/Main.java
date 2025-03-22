import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Additional code to make the program more complex
        Map<String, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        map.put("numbers", list2);
        
        for (String key : map.keySet()) {
            List<Integer> values = map.get(key);
            for (Integer val : values) {
                System.out.println("Value from map: " + val);
            }
        }
        
        // Original write-read pair
        /* write */ list.add(42);
        
        // More complex operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 5);
        }
        
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);
        
        // Original read operation
        /* read */ int value = list.get(0);
        System.out.println("First element: " + value);
        
        // Additional operations after read
        list.remove(0);
        System.out.println("List after removing the first element: " + list);
    }
}