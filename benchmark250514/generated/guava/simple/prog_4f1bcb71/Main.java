import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

enum ExampleEnum {
    ONE, TWO, THREE
}

public class Main {
    public static void main(String[] args) {
        EnumMultiset<ExampleEnum> multiset = EnumMultiset.create(EnumSet.allOf(ExampleEnum.class));
        
        /* write */ multiset.add(ExampleEnum.ONE);
        
        /* read */ int count = multiset.count(ExampleEnum.ONE);
        
        System.out.println(count);
    }
}