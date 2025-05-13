import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMultiset instance using the 'of' method
        /* write */ ImmutableMultiset<String> multiset = ImmutableMultiset.of("apple", "banana", "apple");

        // Create an ImmutableList and perform some operations
        ImmutableList<String> list = ImmutableList.of("cat", "dog", "mouse");
        for (String item : list) {
            System.out.println(item);
        }

        // Create a HashMap and perform some operations
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);

        // Perform some calculations
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += i;
        }
        System.out.println("Result of calculation: " + result);

        // Read the count of "apple" using the 'count' method
        /* read */ int appleCount = multiset.count("apple");
        
        // Print the count of "apple"
        System.out.println("Count of apple in multiset: " + appleCount);
    }
}