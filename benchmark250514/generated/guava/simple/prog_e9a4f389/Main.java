import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements using the builder
        /* write */ builder.add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Count occurrences of the element "apple"
        /* read */ int count = multiset.count("apple");
        
        // Output the count
        System.out.println(count);
    }
}