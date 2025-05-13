import com.google.common.collect.EnumMultiset;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);

        // Add an element to the EnumMultiset
        /* write */ colorMultiset.add(Color.RED);

        // Read the count of the element added
        /* read */ int count = colorMultiset.count(Color.RED);

        // Print the count to verify the read operation
        System.out.println(count);
    }
}