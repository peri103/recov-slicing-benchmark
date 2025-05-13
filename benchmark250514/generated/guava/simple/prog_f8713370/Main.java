import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add(1).add(1).add(2);
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        // Read the count of an element
        /* read */ int countOfOne = multiset.count(1);
        
        // Print the count
        System.out.println(countOfOne);
    }
}