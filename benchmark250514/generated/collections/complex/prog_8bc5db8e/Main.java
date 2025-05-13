import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> map = new LinkedMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashedMap<String, String> stringMap = new HashedMap<>();

        // Fill the list with some values
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Perform operations on stringMap
        stringMap.put("first", "Hello");
        stringMap.put("second", "World");
        String greeting = stringMap.get("first") + " " + stringMap.get("second");

        // Display the greeting
        System.out.println(greeting);

        // Add more values to the list
        for (int i = 5; i < 10; i++) {
            list.add(i * 15);
        }

        /* write */ map.put("key", 42);

        // Perform some operations using the list
        int sum = 0;
        for (Integer value : list) {
            sum += value;
        }

        // Display the sum of values in the list
        System.out.println("Sum of list values: " + sum);

        // More operations on stringMap
        stringMap.put("third", "Apache");
        stringMap.put("fourth", "Commons");
        String library = stringMap.get("third") + " " + stringMap.get("fourth");

        // Display the library name
        System.out.println(library);

        // Retrieve and display the value from the original map
        /* read */ int value = map.get("key");
        System.out.println("Value from map: " + value);
    }
}