import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Create an ImmutableList
        ImmutableList<String> list = ImmutableList.of("banana", "orange", "apple");
        
        // Create an ImmutableMap
        ImmutableMap<String, Integer> map = ImmutableMap.of("banana", 2, "orange", 3, "apple", 5);
        
        // Add elements to the builder
        for (String fruit : list) {
            builder.add(fruit);
        }
        
        // Perform some operations on ImmutableMap
        int orangeCount = map.get("orange");
        System.out.println("Orange count from map: " + orangeCount);
        
        /* write */ 
        builder.add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Perform some operations on ImmutableList
        for (String fruit : list) {
            System.out.println("Fruit from list: " + fruit);
        }
        
        // Calculate total fruits
        int totalFruits = multiset.size();
        System.out.println("Total fruits in multiset: " + totalFruits);
        
        /* read */
        int count = multiset.count("apple");
        
        // Print the count of "apple"
        System.out.println("Apple count from multiset: " + count);
        
        // Additional complex operations
        ImmutableMultiset.Builder<Integer> numberBuilder = ImmutableMultiset.builder();
        numberBuilder.add(1).add(2).add(3).add(2).add(1);
        ImmutableMultiset<Integer> numberMultiset = numberBuilder.build();
        
        int twosCount = numberMultiset.count(2);
        System.out.println("Count of 2s in number multiset: " + twosCount);
        
        int onesCount = numberMultiset.count(1);
        System.out.println("Count of 1s in number multiset: " + onesCount);
    }
}