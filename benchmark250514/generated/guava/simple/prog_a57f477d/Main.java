import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the write method to add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Use the read method to count the occurrences of "apple"
        /* read */ int count = multiset.count("apple");
        
        // Print the count of "apple"
        System.out.println(count);
    }
}