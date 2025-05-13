import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initializing another ImmutableMap for demonstration purposes
        ImmutableMap<String, String> stringMap = ImmutableMap.of("hello", "world", "foo", "bar");

        // Print all entries in the stringMap
        for (String key : stringMap.keySet()) {
            System.out.println("StringMap Key: " + key + ", Value: " + stringMap.get(key));
        }

        // Initializing an ImmutableBiMap with a single entry
        /* write */ ImmutableBiMap<String, Integer> map = ImmutableBiMap.of("key", 42);

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);

        // Using another ImmutableBiMap for demonstration
        ImmutableBiMap<String, Integer> anotherMap = ImmutableBiMap.of("a", 1, "b", 2, "c", 3);
        int anotherValue = anotherMap.get("b");
        System.out.println("AnotherMap Value for 'b': " + anotherValue);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product from 1 to 5: " + product);

        // Reading the value from the original map
        /* read */ Integer value = map.get("key");
        System.out.println("Original Map Value for 'key': " + value);

        // Additional unrelated operations
        int[] numbers = {5, 10, 15, 20};
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Total of numbers array: " + total);
    }
}