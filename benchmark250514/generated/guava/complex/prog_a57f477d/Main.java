import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the write method to add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Initialize another builder for ImmutableSet
        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();
        
        // Add elements to the setBuilder
        setBuilder.add("orange").add("grape").add("banana");
        
        // Build the ImmutableSet
        ImmutableSet<String> fruitSet = setBuilder.build();
        
        // Perform some operations on fruitSet
        System.out.println("ImmutableSet contains 'banana': " + fruitSet.contains("banana"));
        System.out.println("ImmutableSet size: " + fruitSet.size());

        // Introduce some unrelated logic
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Perform some operations on multiset
        System.out.println("Multiset size: " + multiset.size());
        
        // Use the read method to count the occurrences of "apple"
        /* read */ int count = multiset.count("apple");
        
        // Print the count of "apple"
        System.out.println("Count of 'apple' in multiset: " + count);
    }
}