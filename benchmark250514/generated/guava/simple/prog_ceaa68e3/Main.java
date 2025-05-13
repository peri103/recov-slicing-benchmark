import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.naturalOrder();

        // Add elements to the builder
        builder.add("apple");
        builder.add("banana");
        builder.add("apple");

        // Build the ImmutableSortedMultiset
        /* write */ ImmutableSortedMultiset<String> multiset = builder.build();

        // Read the count of a specific element
        /* read */ int count = multiset.count("apple");

        // Print the count
        System.out.println(count);
    }
}