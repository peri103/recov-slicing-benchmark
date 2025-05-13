import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableSortedMultiset using the 'of' method
        /* write */ ImmutableSortedMultiset<String> multiset = ImmutableSortedMultiset.of("apple", "banana", "apple");

        // Read the count of a specific element using the 'count' method
        /* read */ int count = multiset.count("apple");

        // Output the count
        System.out.println(count);
    }
}