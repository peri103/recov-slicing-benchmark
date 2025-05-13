import com.google.common.collect.EnumMultiset;

public class Main {
    public static void main(String[] args) {
        // Define an enum to use with EnumMultiset
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);

        /* write */ colorMultiset.add(Color.RED);

        /* read */ int count = colorMultiset.count(Color.RED);

        System.out.println("Count of RED: " + count);
    }
}