import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMap using the 'of' method
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 1, "key2", 2);

        // Create an ImmutableList and perform operations
        ImmutableList<String> list = ImmutableList.of("item1", "item2", "item3");
        System.out.println("ImmutableList size: " + list.size());
        System.out.println("First item in list: " + list.get(0));

        // Perform calculations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // Use map in a conditional statement
        if (map.size() > 1) {
            System.out.println("Map has more than one entry.");
        }

        // Check if the map contains a specific key using the 'containsKey' method
        /* read */ boolean containsKey = map.containsKey("key1");

        // Output the result
        System.out.println("Does the map contain 'key1'? " + containsKey);

        // Additional operations with the list
        for (String item : list) {
            System.out.println("Processing item: " + item);
        }

        // Create another map and perform operations
        ImmutableMap<String, String> map2 = ImmutableMap.of("name", "Alice", "city", "Wonderland");
        System.out.println("Map2 contains 'name': " + map2.containsKey("name"));
        System.out.println("Map2 value for 'city': " + map2.get("city"));
    }
}