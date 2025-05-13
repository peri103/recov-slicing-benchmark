import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create an immutable map with a key-value pair
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 1);

        // Create an immutable list
        ImmutableList<String> list = ImmutableList.of("item1", "item2", "item3");

        // Perform some operations on the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }

        // Perform an unrelated calculation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Check if the map contains the key "key1"
        /* read */ boolean containsKey = map.containsKey("key1");
        
        System.out.println("Map contains 'key1': " + containsKey);

        // Create another immutable map
        ImmutableMap<String, String> anotherMap = ImmutableMap.of("keyA", "valueA", "keyB", "valueB");

        // Perform operations on the new map
        for (String key : anotherMap.keySet()) {
            System.out.println("Another map key: " + key + ", value: " + anotherMap.get(key));
        }

        // Perform a different calculation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}