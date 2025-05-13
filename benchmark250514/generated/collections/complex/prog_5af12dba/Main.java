import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> map = new MultiKeyMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Populate the simpleMap
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");

        // Populate the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Perform operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List item: " + list.get(i));
        }

        // Perform operations on the simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ map.put("key1", "key2", 42);

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of list items: " + sum);

        // Perform some calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 numbers: " + product);

        // Use simpleMap again
        if (simpleMap.containsKey("A")) {
            System.out.println("SimpleMap contains key 'A' with value: " + simpleMap.get("A"));
        }

        /* read */ Integer value = map.get("key1", "key2");
        
        System.out.println("Value from MultiKeyMap: " + value);

        // Final operations
        list.add(sum);
        System.out.println("Final list: " + list);
    }
}