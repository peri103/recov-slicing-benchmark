import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

public class ColorMultiset {
    enum Color {
        RED, GREEN, BLUE
    }

    private EnumMultiset<Color> multiset = EnumMultiset.create(EnumSet.allOf(Color.class));

    public void addColor(Color color) {
        /* write */ multiset.add(color);
    }

    public int countColor(Color color) {
        return multiset.count(color);
    }
}