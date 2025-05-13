import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the builder to add elements
        /* write */ builder.add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Read the count of a specific element
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println(count);
    }
}