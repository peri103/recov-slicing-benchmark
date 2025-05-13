import com.google.common.collect.EnumMultiset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color { RED, GREEN, BLUE }

        // Initialize EnumMultiset with the Color enum type
        EnumMultiset<Color> multiset = EnumMultiset.create(Arrays.asList(Color.values()));

        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);

        // Get the count of the element added
        /* read */ int count = multiset.count(Color.RED);

        // Print the count to verify the operation
        System.out.println(count);
    }
}