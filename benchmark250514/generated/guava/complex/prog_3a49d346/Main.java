import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a map and populate it with key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Create an ImmutableSet from the map's keys
        ImmutableSet<String> keySet = ImmutableSet.copyOf(map.keySet());

        // Iterate over the keySet and print each key
        for (String key : keySet) {
            System.out.println("Key: " + key);
        }

        // Create another ImmutableList using a different method
        ImmutableList<String> stringList = ImmutableList.of("X", "Y", "Z");

        // Print the elements of the stringList
        for (String str : stringList) {
            System.out.println("String List Element: " + str);
        }

        // Original write method
        /* write */ ImmutableList<Integer> list = ImmutableList.of(1, 2, 3);

        // Perform operations with the map
        map.put("D", 4);
        map.put("E", 5);

        // Calculate and print the sum of values in the map
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);

        // Original read method
        /* read */ int value = list.get(0);
        System.out.println(value);

        // Create another ImmutableList from the map's values
        ImmutableList<Integer> valueList = ImmutableList.copyOf(map.values());

        // Print the elements of the valueList
        for (Integer val : valueList) {
            System.out.println("Value List Element: " + val);
        }
    }
}