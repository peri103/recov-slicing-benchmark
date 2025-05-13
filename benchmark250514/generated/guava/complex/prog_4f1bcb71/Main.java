import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;

enum ExampleEnum {
    ONE, TWO, THREE
}

public class Main {
    public static void main(String[] args) {
        EnumMultiset<ExampleEnum> multiset = EnumMultiset.create(EnumSet.allOf(ExampleEnum.class));
        
        /* write */ multiset.add(ExampleEnum.ONE);
        
        // Adding more elements to the multiset
        multiset.add(ExampleEnum.TWO);
        multiset.add(ExampleEnum.THREE);
        multiset.add(ExampleEnum.TWO);
        
        // Performing operations on the multiset
        int countTwo = multiset.count(ExampleEnum.TWO);
        System.out.println("Count of TWO: " + countTwo);
        
        // Adding more unrelated code
        int sum = 0;
        for (ExampleEnum value : ExampleEnum.values()) {
            sum += multiset.count(value);
        }
        System.out.println("Total count of all elements: " + sum);
        
        // More complex operations
        EnumMultiset<ExampleEnum> anotherMultiset = EnumMultiset.create(EnumSet.allOf(ExampleEnum.class));
        anotherMultiset.add(ExampleEnum.THREE);
        anotherMultiset.add(ExampleEnum.THREE);
        
        int countThreeInAnother = anotherMultiset.count(ExampleEnum.THREE);
        System.out.println("Count of THREE in anotherMultiset: " + countThreeInAnother);
        
        /* read */ int count = multiset.count(ExampleEnum.ONE);
        
        System.out.println("Count of ONE: " + count);
        
        // Final operations
        multiset.add(ExampleEnum.THREE);
        int finalCountThree = multiset.count(ExampleEnum.THREE);
        System.out.println("Final count of THREE: " + finalCountThree);
    }
}