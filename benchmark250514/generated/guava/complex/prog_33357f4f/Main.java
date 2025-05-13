import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        // Build an ImmutableSet using the builder
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        builder.addAll(hashSet);
        /* write */ builder.add("example");
        builder.add("orange");
        
        // Perform some operations with HashSet
        hashSet.remove("banana");
        hashSet.add("grape");
        
        // Build the ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();

        // Perform some operations with ImmutableSet
        boolean containsOrange = immutableSet.contains("orange");
        System.out.println("Contains orange: " + containsOrange);

        // More operations with HashSet
        hashSet.clear();
        hashSet.add("kiwi");
        hashSet.add("mango");

        // Check if 'example' is contained in the ImmutableSet
        /* read */ boolean containsExample = immutableSet.contains("example");
        System.out.println("Contains example: " + containsExample);

        // Additional complex operations
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("pineapple");
        anotherSet.add("watermelon");

        for (String fruit : anotherSet) {
            System.out.println("Fruit: " + fruit);
        }

        // Final operations with HashSet
        hashSet.addAll(anotherSet);
        for (String fruit : hashSet) {
            System.out.println("HashSet Fruit: " + fruit);
        }
    }
}