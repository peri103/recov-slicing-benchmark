import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableList<String> keys = ImmutableList.of("key1", "key2", "key3");
        ImmutableMap<String, Integer> values = ImmutableMap.of("key1", 100, "key2", 200, "key3", 300);

        // Using ImmutableMap to store values
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("key4", 400, "key5", 500);

        // Using ImmutableSortedMap to store and retrieve a value
        /* write */ ImmutableSortedMap<String, Integer> map = ImmutableSortedMap.of("key1", 100);
        
        // Perform some unrelated operations
        int sum = 0;
        for (String key : keys) {
            sum += values.get(key);
        }
        System.out.println("Sum of values: " + sum);

        // Use another ImmutableSortedMap
        ImmutableSortedMap<String, Integer> anotherMap = ImmutableSortedMap.of("key2", 200, "key3", 300);
        Integer anotherValue = anotherMap.get("key2");
        System.out.println("Value from anotherMap: " + anotherValue);

        // Retrieve the value from the original map
        /* read */ Integer value = map.get("key1");
        System.out.println("Value from original map: " + value);

        // Additional operations
        int product = 1;
        for (String key : immutableMap.keySet()) {
            product *= immutableMap.get(key);
        }
        System.out.println("Product of immutableMap values: " + product);
    }
}