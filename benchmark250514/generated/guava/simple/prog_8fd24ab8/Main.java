import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableSet.Builder
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        
        // Add an element to the set using the builder
        /* write */ builder.add("element");

        // Build the ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();

        // Check if the set contains the element
        /* read */ boolean containsElement = immutableSet.contains("element");
        
        // Print the result
        System.out.println(containsElement);
    }
}