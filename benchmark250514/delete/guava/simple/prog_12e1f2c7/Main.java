import com.google.common.collect.EnumMultiset;
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

        // Read the count of the element added
        /* read */ int count = multiset.count(Color.RED);

        // Print the count
        System.out.println(count);
    }
}