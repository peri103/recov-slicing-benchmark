import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        /* write */ builder.add("apple"); // Add an element to the builder
        
        // Create another builder for ImmutableSet
        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();
        setBuilder.add("banana");
        setBuilder.add("orange");
        
        // Build the ImmutableSet
        ImmutableSet<String> fruitSet = setBuilder.build();
        
        // Check if the set contains "banana"
        boolean containsBanana = fruitSet.contains("banana");
        System.out.println("Contains banana: " + containsBanana);
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Perform some operations on the multiset
        int totalElements = multiset.size();
        System.out.println("Total elements in multiset: " + totalElements);
        
        /* read */ int count = multiset.count("apple"); // Read the count of the element
        
        System.out.println("Count of 'apple': " + count);
        
        // Iterate over the elements in the multiset
        for (String element : multiset.elementSet()) {
            System.out.println("Element: " + element + ", Count: " + multiset.count(element));
        }
        
        // Further operations with ImmutableSet
        for (String fruit : fruitSet) {
            System.out.println("Fruit in set: " + fruit);
        }
    }
}