import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.<String>naturalOrder();
        
        // Add elements to the builder
        builder.add("apple");
        builder.add("banana");
        
        // Build the ImmutableSortedMultiset
        /* write */ ImmutableSortedMultiset<String> multiset = builder.build();
        
        // Count the occurrences of "apple" in the multiset
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println(count);
    }
}