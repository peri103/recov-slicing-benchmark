import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.naturalOrder();

        // Add elements using the builder
        /* write */ builder.add("apple");
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();
        
        // Read the count of the element "apple"
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println(count);
    }
}