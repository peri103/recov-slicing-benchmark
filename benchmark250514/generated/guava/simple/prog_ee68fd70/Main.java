import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Read the count of a specific element
        /* read */ int appleCount = multiset.count("apple");
        
        // Print the count of 'apple'
        System.out.println(appleCount);
    }
}