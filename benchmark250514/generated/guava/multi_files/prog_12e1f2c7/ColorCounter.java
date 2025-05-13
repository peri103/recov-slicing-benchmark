import com.google.common.collect.EnumMultiset;
import java.util.Arrays;

public class ColorCounter {
    // Define an enum for demonstration purposes
    public enum Color {
        RED, GREEN, BLUE
    }

    private EnumMultiset<Color> multiset;

    public ColorCounter() {
        // Create an EnumMultiset instance for the Color enum
        multiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));
    }

    public void addColor(Color color) {
        /* write */ multiset.add(color);
    }

    public int getColorCount(Color color) {
        return multiset.count(color);
    }
}
