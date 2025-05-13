import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMap using the 'of' method
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key", 42);

        // Create an ImmutableList using the 'of' method
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");

        // Perform some operations on the ImmutableList
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Create another ImmutableMap using the 'of' method
        ImmutableMap<String, String> colorMap = ImmutableMap.of("red", "#FF0000", "green", "#00FF00", "blue", "#0000FF");

        // Access and print values from the colorMap
        System.out.println("Red color code: " + colorMap.get("red"));
        System.out.println("Green color code: " + colorMap.get("green"));
        System.out.println("Blue color code: " + colorMap.get("blue"));

        // Perform some unrelated calculations
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + result);

        // Read the value associated with the key "key" from the original map
        /* read */ Integer value = map.get("key");

        // Print the value
        System.out.println("Value from original map: " + value);

        // Perform some more unrelated operations
        ImmutableList<Integer> numbers = ImmutableList.of(10, 20, 30, 40, 50);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers in list: " + sum);
    }
}