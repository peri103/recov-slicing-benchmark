import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSet
        Builder<String> builder = ImmutableSet.builder();
        
        // Write operation: add a value to the builder
        /* write */ builder.add("exampleValue");
        
        // Build the ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();
        
        // Read operation: check if the set contains the added value
        /* read */ boolean contains = immutableSet.contains("exampleValue");
        
        // Print the result
        System.out.println(contains);
    }
}