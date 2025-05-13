import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance for the enum Color
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(EnumSet.allOf(Color.class));

        // Use the write method to add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Use the read method to count the occurrences of the element added
        /* read */ int count = colorMultiset.count(Color.RED);

        // Print the count to verify the read operation
        System.out.println("Count of RED: " + count);
    }
}