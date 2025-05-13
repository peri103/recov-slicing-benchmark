import org.apache.commons.collections4.list.CursorableLinkedList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CursorableLinkedList<Integer> list = new CursorableLinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        
        // Add some values to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Perform some operations on the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Write to the list
        /* write */ list.add(1);

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Add more elements to the list
        list.add(2);
        list.add(3);

        // Perform operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element at index " + i + ": " + list.get(i));
        }

        // Read from the list
        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);

        // Perform more operations on the map
        map.put("Four", 4);
        map.remove("Two");
        System.out.println("Updated map: " + map);
    }
}