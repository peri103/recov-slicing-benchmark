import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();
        
        /* write */ builder.add(1); // Add an element to the builder
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        /* read */ int count = multiset.count(1); // Read the count of the element
        
        System.out.println(count); // Output the count
    }
}