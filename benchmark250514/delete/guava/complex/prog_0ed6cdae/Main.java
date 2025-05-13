import com.google.common.collect.EnumMultiset;
import com.google.common.collect.HashMultiset;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        // Define an enum to use with EnumMultiset
        enum Colors {
            RED, GREEN, BLUE
        }

        // Initialize EnumMultiset with the enum type
        EnumMultiset<Colors> multiset = EnumMultiset.create(EnumSet.allOf(Colors.class));

        // Add an element to the multiset
        /* write */ multiset.add(Colors.RED);

        // Initialize another multiset for demonstration
        HashMultiset<String> stringMultiset = HashMultiset.create();
        stringMultiset.add("apple");
        stringMultiset.add("banana");
        stringMultiset.add("apple");

        // Perform operations on the second multiset
        System.out.println("Count of 'apple': " + stringMultiset.count("apple"));
        System.out.println("Count of 'banana': " + stringMultiset.count("banana"));

        // Iterate through the EnumMultiset elements
        for (Colors color : Colors.values()) {
            System.out.println("Color: " + color + ", Count: " + multiset.count(color));
        }

        // Count the occurrences of the element added
        /* read */ int count = multiset.count(Colors.RED);

        // Print the count of the element
        System.out.println("Count of RED: " + count); // Should output 1

        // Add more elements to the EnumMultiset
        multiset.add(Colors.GREEN);
        multiset.add(Colors.BLUE);
        multiset.add(Colors.RED);

        // Print the counts after adding more elements
        System.out.println("Final counts:");
        for (Colors color : Colors.values()) {
            System.out.println("Color: " + color + ", Count: " + multiset.count(color));
        }
    }
}