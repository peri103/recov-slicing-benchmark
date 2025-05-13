import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color { RED, GREEN, BLUE }

        // Create an EnumMultiset for the enum Color
        EnumMultiset<Color> multiset = EnumMultiset.create(EnumSet.allOf(Color.class));

        /* write */ multiset.add(Color.RED);
        /* read */ int count = multiset.count(Color.RED);

        System.out.println("Count of RED: " + count);
    }
}