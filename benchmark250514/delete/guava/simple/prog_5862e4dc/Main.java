import com.google.common.collect.EnumMultiset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        enum Color { RED, GREEN, BLUE }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));

        // Add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Read the count of the added element
        /* read */ int count = colorMultiset.count(Color.RED);

        // Output the count
        System.out.println(count);
    }
}