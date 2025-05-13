import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSet
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();

        // Add an element to the builder
        /* write */ builder.add("example");

        // Build the ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();

        // Check if the ImmutableSet contains the element
        /* read */ boolean contains = immutableSet.contains("example");

        System.out.println(contains); // This should print true
    }
}