import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.<Integer>naturalOrder();
        
        // Add elements to the builder
        builder.add(1, 2); // Add element '1' with a count of '2'
        builder.add(3, 5); // Add element '3' with a count of '5'
        builder.add(2, 1); // Add element '2' with a count of '1'
        
        // Build the multiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        // Create an ImmutableList for demonstration
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        
        // Print elements of the ImmutableList
        for (String fruit : immutableList) {
            System.out.println(fruit);
        }
        
        // Perform some operations on ImmutableSortedMultiset
        int totalDistinctElements = multiset.elementSet().size();
        System.out.println("Total distinct elements: " + totalDistinctElements);
        
        // Calculate the sum of all counts in the multiset
        int totalCount = 0;
        for (Integer element : multiset.elementSet()) {
            totalCount += multiset.count(element);
        }
        System.out.println("Total count of all elements: " + totalCount);
        
        // Retrieve the count of a specific element
        /* read */ int count = multiset.count(1); // Get the count of element '1'
        System.out.println("Count of element '1': " + count);
        
        // Additional operations to increase complexity
        ImmutableSortedMultiset.Builder<String> stringBuilder = ImmutableSortedMultiset.<String>naturalOrder();
        stringBuilder.add("orange", 3);
        stringBuilder.add("kiwi", 2);
        ImmutableSortedMultiset<String> fruitMultiset = stringBuilder.build();
        
        for (String fruit : fruitMultiset.elementSet()) {
            System.out.println(fruit + ": " + fruitMultiset.count(fruit));
        }
    }
}