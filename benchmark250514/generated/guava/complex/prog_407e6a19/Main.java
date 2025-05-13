import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset.Builder;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the builder to add elements to the multiset
        /* write */ builder.add("apple");
        
        // Add more elements to the builder
        builder.add("banana");
        builder.add("orange");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Create an ImmutableMap
        ImmutableMap<String, Integer> fruitMap = ImmutableMap.of(
            "apple", 1,
            "banana", 2,
            "orange", 3
        );
        
        // Use a HashMap to store some data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("apple", 10);
        dataMap.put("banana", 20);
        dataMap.put("orange", 30);
        
        // Perform operations on the HashMap
        int appleValue = dataMap.get("apple");
        int bananaValue = dataMap.get("banana");
        System.out.println("Apple value: " + appleValue);
        System.out.println("Banana value: " + bananaValue);
        
        // Read the count of the element "apple" in the multiset
        /* read */ int count = multiset.count("apple");
        
        // Output the count
        System.out.println("Count of 'apple' in multiset: " + count);
        
        // Iterate over the ImmutableMap and print values
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Perform some calculations
        int sum = appleValue + bananaValue;
        System.out.println("Sum of apple and banana values: " + sum);
        
        // More operations on the HashMap
        dataMap.put("apple", dataMap.get("apple") + 5);
        System.out.println("Updated apple value: " + dataMap.get("apple"));
    }
}