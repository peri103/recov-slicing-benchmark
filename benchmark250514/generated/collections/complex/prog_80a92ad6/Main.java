import org.apache.commons.collections4.map.HashedMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashedMap<String, Integer> map = new HashedMap<>();
        HashSet<String> keysSet = new HashSet<>();
        ArrayList<Integer> valuesList = new ArrayList<>();

        // Adding some initial values to the map and other collections
        map.put("initialKey1", 10);
        map.put("initialKey2", 20);
        keysSet.add("initialKey1");
        keysSet.add("initialKey2");
        valuesList.add(10);
        valuesList.add(20);

        // Manipulating the map, set, and list
        for (String key : keysSet) {
            if (map.containsKey(key)) {
                int newValue = map.get(key) + 5;
                map.put(key, newValue);
                valuesList.add(newValue);
            }
        }

        // Adding a new entry to the map
        /* write */ map.put("key", 42);

        // Further operations on the collections
        for (int value : valuesList) {
            if (value % 2 == 0) {
                System.out.println("Even value: " + value);
            }
        }

        // More complex logic
        int sum = 0;
        for (int value : valuesList) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Final read operation
        /* read */ int value = map.get("key");
        System.out.println("Read value: " + value);

        // Additional logic after the read
        map.put("anotherKey", 100);
        keysSet.add("anotherKey");
        valuesList.add(100);

        for (String key : keysSet) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}