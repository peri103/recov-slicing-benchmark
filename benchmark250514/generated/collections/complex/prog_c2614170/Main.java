import org.apache.commons.collections4.list.CursorableLinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CursorableLinkedList<Integer> list = new CursorableLinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Add elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform some operations on the map
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        
        // Write to the list
        /* write */ list.add(42);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Use a different list for more operations
        CursorableLinkedList<String> stringList = new CursorableLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Read from the original list
        /* read */ int value = list.get(0);
        System.out.println("Read value from list: " + value);
        
        // Perform more operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}