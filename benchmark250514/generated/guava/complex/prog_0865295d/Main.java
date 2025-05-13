import com.google.common.collect.TreeMultimap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding elements to the HashMap
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        hashMap.put("numbers", list);
        
        // Perform operations on HashMap
        List<Integer> retrievedList = hashMap.get("numbers");
        for (Integer number : retrievedList) {
            multimap.put("key", number);
        }
        
        // Insert unrelated code to make the program more complex
        int sum = 0;
        for (Integer number : retrievedList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        /* write */ multimap.put("key", 42);
        
        // More complex operations
        List<Integer> anotherList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            anotherList.add(i * 5);
        }
        
        for (Integer number : anotherList) {
            multimap.put("anotherKey", number);
        }
        
        // Retrieve and print values from multimap
        List<Integer> values = new ArrayList<>(multimap.get("anotherKey"));
        for (Integer value : values) {
            System.out.println("Value from anotherKey: " + value);
        }
        
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        System.out.println("Value from key: " + value);
    }
}