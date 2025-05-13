import com.google.common.collect.EnumMultiset;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Initialize an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);

        /* write */ colorMultiset.add(Color.RED);
        
        /* read */ int count = colorMultiset.count(Color.RED);
        
        // Output the count to verify the read operation
        System.out.println("Count of RED: " + count);
    }
}