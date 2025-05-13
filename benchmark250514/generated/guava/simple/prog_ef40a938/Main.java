import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Creating an ImmutableSortedMultiset instance with some elements
        /* write */ ImmutableSortedMultiset<String> multiset = ImmutableSortedMultiset.of("apple", "banana", "apple");

        // Reading the count of a specific element
        /* read */ int count = multiset.count("apple");

        // Output the count
        System.out.println(count);
    }
}