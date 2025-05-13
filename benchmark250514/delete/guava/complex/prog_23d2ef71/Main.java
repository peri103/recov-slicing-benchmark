import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // ImmutableMultimap does not have a direct put method since it's immutable.
        // We need to use the builder to add entries and then build the multimap.
        ImmutableMultimap.Builder<String, Integer> builder = ImmutableMultimap.builder();
        
        /* write */ builder.put("key", 42);
        
        // Create another builder for a different multimap
        ImmutableMultimap.Builder<String, String> builder2 = ImmutableMultimap.builder();
        builder2.put("fruit", "apple");
        builder2.put("fruit", "banana");
        ImmutableMultimap<String, String> fruitMultimap = builder2.build();
        
        // Perform operations on the fruitMultimap
        ImmutableSet<String> fruits = fruitMultimap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Create an ImmutableList and perform operations
        ImmutableList<Integer> numbers = ImmutableList.of(1, 2, 3, 4, 5);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Build the original multimap
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        // Perform operations on the multimap
        ImmutableSet<Integer> values = multimap.get("key");
        int total = 0;
        for (Integer val : values) {
            total += val;
        }
        System.out.println("Total value: " + total);
        
        // More operations
        ImmutableSet<String> keys = multimap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }
        
        /* read */ int value = multimap.get("key").iterator().next();
        
        System.out.println("Read value: " + value);
        
        // Create an ImmutableSet and perform operations
        ImmutableSet<String> colors = ImmutableSet.of("red", "green", "blue");
        for (String color : colors) {
            System.out.println("Color: " + color);
        }
    }
}