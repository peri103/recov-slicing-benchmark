import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Initialize builder to construct ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();
        
        // Read the count of a specific element
        /* read */ int appleCount = multiset.count("apple");
        
        // Output the count of "apple"
        System.out.println(appleCount);
    }
}