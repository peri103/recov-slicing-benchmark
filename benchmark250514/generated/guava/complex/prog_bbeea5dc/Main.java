import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSet
        Builder<String> builder = ImmutableSet.builder();

        // Write operation: add a value to the builder
        /* write */ builder.add("exampleValue");

        // Create a HashSet and add some values
        Set<String> hashSet = new HashSet<>();
        hashSet.add("anotherValue");
        hashSet.add("yetAnotherValue");

        // Perform some operations on HashSet
        if (hashSet.contains("anotherValue")) {
            hashSet.remove("anotherValue");
        }

        // Build the ImmutableSet
        ImmutableSet<String> immutableSet = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read operation: check if the set contains the added value
        /* read */ boolean contains = immutableSet.contains("exampleValue");

        // Print the result
        System.out.println("ImmutableSet contains 'exampleValue': " + contains);

        // Further operations on HashSet
        hashSet.add("newValue");
        for (String value : hashSet) {
            System.out.println("HashSet value: " + value);
        }
    }
}