import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        enum Color { RED, GREEN, BLUE }
        
        EnumMultiset<Color> multiset = EnumMultiset.create(EnumSet.allOf(Color.class));
        
        /* write */ multiset.add(Color.RED);
        
        /* read */ int count = multiset.count(Color.RED);
        
        System.out.println(count);
    }
}