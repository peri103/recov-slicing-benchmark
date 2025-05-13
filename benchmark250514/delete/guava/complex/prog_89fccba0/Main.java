import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset.Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder as SetBuilder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = new ImmutableMultiset.Builder<>();
        SetBuilder<Integer> setBuilder = new ImmutableSet.Builder<>();
        
        // Add elements to the setBuilder
        setBuilder.add(1);
        setBuilder.add(2);
        setBuilder.add(3);
        
        // Build the ImmutableSet
        ImmutableSet<Integer> immutableSet = setBuilder.build();

        // Perform some operations on ImmutableSet
        for (Integer num : immutableSet) {
            System.out.println("Set element: " + num);
        }

        /* write */ builder.add("apple");
        
        // Add more elements to the multiset builder
        builder.add("banana");
        builder.add("orange");

        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();

        // Perform some operations on ImmutableMultiset
        for (String fruit : multiset.elementSet()) {
            System.out.println("Multiset element: " + fruit + " - Count: " + multiset.count(fruit));
        }

        // Add more unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ int count = multiset.count("apple");
        System.out.println("Count of 'apple': " + count);

        // More complex operations
        int product = 1;
        for (int i : immutableSet) {
            product *= i;
        }
        System.out.println("Product of set elements: " + product);
    }
}