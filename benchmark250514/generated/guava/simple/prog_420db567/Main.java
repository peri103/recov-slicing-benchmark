import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        /* write */ builder.add("apple"); // Add an element to the builder
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        /* read */ int count = multiset.count("apple"); // Read the count of the element
        
        System.out.println(count);
    }
}