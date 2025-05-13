import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements using the builder
        /* write */ builder.add("apple");
        
        // Perform additional operations unrelated to the original write-read pair
        ImmutableList<String> immutableList = ImmutableList.of("banana", "orange", "grape");
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("banana", 2, "orange", 3, "grape", 5);
        
        // Iterate over the ImmutableList and print each element
        for (String fruit : immutableList) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Perform operations on ImmutableMap
        for (String key : immutableMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + immutableMap.get(key));
        }
        
        // Count occurrences of the element "apple"
        /* read */ int count = multiset.count("apple");
        
        // Output the count
        System.out.println("Count of 'apple': " + count);
        
        // Further operations to make the program more complex
        ImmutableMultiset.Builder<Integer> numberBuilder = ImmutableMultiset.builder();
        numberBuilder.add(1).add(2).add(3).add(1);
        ImmutableMultiset<Integer> numberMultiset = numberBuilder.build();
        
        // Count occurrences of the number 1
        int numberCount = numberMultiset.count(1);
        System.out.println("Count of number '1': " + numberCount);
        
        // Iterate over the numberMultiset and print each element
        for (Integer number : numberMultiset.elementSet()) {
            System.out.println("Number: " + number + ", Occurrences: " + numberMultiset.count(number));
        }
    }
}