import com.google.common.collect.EnumMultiset;
import java.util.Arrays;

// Define an example enum
enum Color {
    RED, GREEN, BLUE
}

public class Main {
    public static void main(String[] args) {
        // Initialize the EnumMultiset with the enum type
        EnumMultiset<Color> multiset = EnumMultiset.create(Color.class);
        
        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);
        
        // Read the count of the element in the multiset
        /* read */ int count = multiset.count(Color.RED);
        
        // Print the count
        System.out.println(count);
    }
}