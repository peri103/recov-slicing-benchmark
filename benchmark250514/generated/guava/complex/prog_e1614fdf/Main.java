import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Additional complex operations
        ImmutableListMultimap<String, String> listMultimap = ImmutableListMultimap.of("fruit", "apple", "fruit", "banana");
        ImmutableList<String> fruitList = listMultimap.get("fruit");
        System.out.println("Fruits: " + fruitList);

        // Some arithmetic operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Write operation
        /* write */ ImmutableSetMultimap<String, Integer> multimap = ImmutableSetMultimap.of("key", 1);

        // Logical operations
        boolean isTrue = true;
        boolean isFalse = false;
        boolean result = isTrue && !isFalse;
        System.out.println("Logical result: " + result);

        // Read operation
        /* read */ ImmutableSet<Integer> values = multimap.get("key");
        
        // Output the values
        System.out.println(values);

        // Additional operations
        ImmutableSetMultimap<String, Integer> anotherMultimap = ImmutableSetMultimap.of("key", 2, "key", 3);
        ImmutableSet<Integer> moreValues = anotherMultimap.get("key");
        System.out.println("More values: " + moreValues);

        // Looping operations
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}