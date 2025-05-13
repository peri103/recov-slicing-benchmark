import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableSortedSet
        ImmutableSortedSet<Integer> set = ImmutableSortedSet.of(1, 2, 3, 4, 5); // /* write */

        // Perform some unrelated operations
        ImmutableList<String> names = ImmutableList.of("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Create another ImmutableSortedSet
        ImmutableSortedSet<String> stringSet = ImmutableSortedSet.of("apple", "banana", "cherry");
        if (stringSet.contains("banana")) {
            System.out.println("StringSet contains banana");
        }

        // More unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Check if the original set contains a specific value
        boolean containsValue = set.contains(3); // /* read */
        System.out.println("Original set contains 3: " + containsValue);

        // Additional unrelated operations
        ImmutableList<Integer> numbers = ImmutableList.of(10, 20, 30, 40, 50);
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Final operation
        if (set.contains(5)) {
            System.out.println("Original set contains 5");
        }
    }
}