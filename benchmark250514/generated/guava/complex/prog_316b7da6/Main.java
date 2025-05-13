import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMultiset.Builder instance
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the builder to add elements
        /* write */ builder.add("apple");
        
        // Add more elements to the builder
        builder.add("banana");
        builder.add("orange");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Perform operations unrelated to the original write-read pair
        ImmutableSet.Builder<Integer> setBuilder = ImmutableSet.builder();
        setBuilder.add(1);
        setBuilder.add(2);
        setBuilder.add(3);
        ImmutableSet<Integer> intSet = setBuilder.build();
        
        // Iterate over the ImmutableSet and print each element
        for (Integer num : intSet) {
            System.out.println("Set element: " + num);
        }
        
        // Calculate the sum of elements in the ImmutableSet
        int sum = 0;
        for (Integer num : intSet) {
            sum += num;
        }
        System.out.println("Sum of set elements: " + sum);
        
        // Use the count method to read the number of occurrences of "apple"
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println("Count of 'apple': " + count);
        
        // Further operations with the multiset
        int totalElements = multiset.size();
        System.out.println("Total elements in multiset: " + totalElements);
        
        // Print each element and its count in the multiset
        for (String element : multiset.elementSet()) {
            System.out.println("Element: " + element + ", Count: " + multiset.count(element));
        }
    }
}