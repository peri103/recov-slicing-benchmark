import com.google.common.collect.EnumMultiset;
import com.google.common.collect.HashMultiset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance for the Color enum
        EnumMultiset<Color> multiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));

        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);

        // Create another multiset for demonstration
        HashMultiset<String> stringMultiset = HashMultiset.create();
        stringMultiset.add("apple");
        stringMultiset.add("banana");
        stringMultiset.add("apple");

        // Perform some operations on the string multiset
        int appleCount = stringMultiset.count("apple");
        System.out.println("Apple count: " + appleCount);

        // Perform additional unrelated operations
        int sum = 0;
        for (Color color : Color.values()) {
            sum += color.ordinal();
        }
        System.out.println("Sum of ordinals: " + sum);

        // Read the count of the element added to the original multiset
        /* read */ int count = multiset.count(Color.RED);

        // Print the count
        System.out.println("Count of RED: " + count);

        // Perform more operations on the string multiset
        stringMultiset.add("orange");
        int orangeCount = stringMultiset.count("orange");
        System.out.println("Orange count: " + orangeCount);

        // Final operation to show complexity
        for (String fruit : stringMultiset.elementSet()) {
            System.out.println(fruit + ": " + stringMultiset.count(fruit));
        }
    }
}