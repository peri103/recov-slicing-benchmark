import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize builder to construct ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();
        
        // Create an unrelated ImmutableList for demonstration
        ImmutableList<String> fruits = ImmutableList.of("orange", "grape", "melon");
        
        // Print all elements in the ImmutableList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Perform some operations on ImmutableSortedMultiset
        boolean hasBanana = multiset.contains("banana");
        System.out.println("Contains banana: " + hasBanana);
        
        // Read the count of a specific element
        /* read */ int appleCount = multiset.count("apple");
        
        // Output the count of "apple"
        System.out.println("Apple count: " + appleCount);
        
        // Create another ImmutableSortedMultiset for demonstration
        ImmutableSortedMultiset.Builder<String> anotherBuilder = ImmutableSortedMultiset.naturalOrder();
        anotherBuilder.add("kiwi").add("kiwi").add("pear");
        ImmutableSortedMultiset<String> anotherMultiset = anotherBuilder.build();
        
        // Print all elements in another ImmutableSortedMultiset
        for (String fruit : anotherMultiset.elementSet()) {
            System.out.println(fruit + ": " + anotherMultiset.count(fruit));
        }
    }
}