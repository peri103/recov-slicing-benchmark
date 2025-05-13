import com.google.common.collect.EnumMultiset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));

        // Add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Count the occurrences of an element in the multiset
        /* read */ int count = colorMultiset.count(Color.RED);

        // Print the count
        System.out.println(count);
    }
}