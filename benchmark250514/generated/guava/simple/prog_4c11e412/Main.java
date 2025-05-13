import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        Builder<String> builder = ImmutableSortedMultiset.builder();

        // Use the write method to add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");

        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();

        // Use the read method to count occurrences of "apple"
        /* read */ int count = multiset.count("apple");

        // Print the count
        System.out.println(count);
    }
}