import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> multiset = EnumMultiset.create(EnumSet.allOf(Color.class));

        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);

        // Count the occurrences of the element in the multiset
        /* read */ int count = multiset.count(Color.RED);

        // Print the count
        System.out.println(count);
    }
}