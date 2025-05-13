import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the builder to add elements to the multiset
        /* write */ builder.add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Read the count of the element "apple" in the multiset
        /* read */ int count = multiset.count("apple");
        
        // Output the count
        System.out.println(count);
    }
}