import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMultiset.Builder instance
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the builder to add elements
        /* write */ builder.add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Use the count method to read the number of occurrences of "apple"
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println(count);
    }
}