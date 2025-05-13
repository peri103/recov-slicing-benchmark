import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        ImmutableSortedSet.Builder<Integer> anotherBuilder = ImmutableSortedSet.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add(5);
        
        // Add more elements to another builder
        anotherBuilder.add(10).add(20).add(30);
        
        // Build the ImmutableSortedSets
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        ImmutableSortedSet<Integer> anotherSortedSet = anotherBuilder.build();
        
        // Unrelated operations
        int sum = 0;
        for (Integer num : anotherSortedSet) {
            sum += num;
        }
        System.out.println("Sum of elements in anotherSortedSet: " + sum);
        
        // More unrelated operations
        ImmutableSet<String> stringSet = ImmutableSet.of("apple", "banana", "cherry");
        for (String fruit : stringSet) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Check if the set contains the element
        /* read */ boolean contains = sortedSet.contains(5);
        
        // Print the result
        System.out.println("Does sortedSet contain 5? " + contains);
        
        // Further unrelated operations
        ImmutableSortedSet<Integer> combinedSet = ImmutableSortedSet.<Integer>naturalOrder()
                .addAll(sortedSet)
                .addAll(anotherSortedSet)
                .build();
        
        System.out.println("Combined Set: " + combinedSet);
    }
}