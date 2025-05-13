import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();

        // Use the builder to add elements to the set
        /* write */ builder.add(1).add(2).add(3);

        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();

        // Use the contains method to check if an element is in the set
        /* read */ boolean contains = sortedSet.contains(2);

        // Print the result
        System.out.println(contains);
    }
}