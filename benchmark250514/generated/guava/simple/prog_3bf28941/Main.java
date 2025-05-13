import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements using the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Use the count method to read the number of occurrences of "apple"
        /* read */ int appleCount = multiset.count("apple");
        
        // Print the count of "apple"
        System.out.println(appleCount);
    }
}