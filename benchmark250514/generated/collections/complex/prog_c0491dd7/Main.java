import org.apache.commons.collections4.list.TreeList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> list = new TreeList<>();
        HashMap<String, Integer> map = new HashMap<>();
        List<String> keys = new TreeList<>();
        
        // Adding elements to the HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Adding keys to the TreeList
        keys.add("one");
        keys.add("two");
        keys.add("three");

        // Processing elements in the HashMap
        for (String key : keys) {
            int value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        /* write */ list.add(42);

        // Performing some operations before reading the value
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Processing the TreeList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element at index " + i + ": " + list.get(i));
        }

        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);

        // Additional operations
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of elements: " + sum);
    }
}