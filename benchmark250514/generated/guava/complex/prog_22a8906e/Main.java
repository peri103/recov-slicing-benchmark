import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSet
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();

        // Add an element to the builder
        /* write */ builder.add("example");

        // Create another ImmutableSet using a different builder
        ImmutableSet.Builder<Integer> intBuilder = ImmutableSet.builder();
        for (int i = 0; i < 5; i++) {
            intBuilder.add(i);
        }
        ImmutableSet<Integer> intSet = intBuilder.build();

        // Perform operations on the integer set
        int sum = 0;
        for (Integer num : intSet) {
            sum += num;
        }
        System.out.println("Sum of elements in intSet: " + sum);

        // Build the original ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();

        // Create an ImmutableList from the original ImmutableSet
        ImmutableList<String> immutableList = ImmutableList.copyOf(immutableSet);

        // Perform operations on the ImmutableList
        for (String str : immutableList) {
            System.out.println("ImmutableList element: " + str);
        }

        // Check if the ImmutableSet contains the element
        /* read */ boolean contains = immutableSet.contains("example");

        System.out.println(contains); // This should print true

        // Additional complex operations
        ImmutableSet.Builder<String> mixedBuilder = ImmutableSet.builder();
        mixedBuilder.addAll(immutableSet);
        mixedBuilder.add("additional");
        ImmutableSet<String> mixedSet = mixedBuilder.build();

        for (String str : mixedSet) {
            System.out.println("MixedSet element: " + str);
        }
    }
}