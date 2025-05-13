import com.google.common.collect.EnumMultiset;
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

        // Count the occurrences of the element added
        /* read */ int count = multiset.count(Colors.RED);

        // Print the count of the element
        System.out.println(count); // Should output 1
    }
}