import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a FixedSizeMap with a fixed size
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key1", null); // Initialize with null values to ensure fixed size
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);

        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Perform some operations on the list
        for (String s : list) {
            System.out.println(s.toUpperCase());
        }

        // Add more elements to the list
        list.add("Java");
        list.add("Programming");

        /* write */ fixedSizeMap.put("key1", 42);

        // Perform operations using the values from the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + ": " + list.get(i));
        }

        // Add another entry to the FixedSizeMap
        baseMap.put("key2", null); // expand baseMap to accommodate more entries
        FixedSizeMap<String, Integer> extendedMap = FixedSizeMap.fixedSizeMap(baseMap);
        extendedMap.put("key2", 84);

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ Integer value = fixedSizeMap.get("key1");
        System.out.println("Value from FixedSizeMap: " + value);

        // Print elements from the extended map
        System.out.println("Value for key2: " + extendedMap.get("key2"));
    }
}