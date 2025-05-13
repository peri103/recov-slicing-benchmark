import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> builder = ImmutableSetMultimap.builder();
        
        /* write */ builder.put("key", 1);
        
        // Additional unrelated code using ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> listBuilder = ImmutableListMultimap.builder();
        listBuilder.put("fruit", "apple");
        listBuilder.put("fruit", "banana");
        listBuilder.put("vegetable", "carrot");
        ImmutableListMultimap<String, String> listMultimap = listBuilder.build();
        
        // Process the ImmutableListMultimap
        java.util.List<String> fruits = listMultimap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> multimap = builder.build();
        
        // More unrelated code
        int sum = 0;
        for (String key : multimap.keySet()) {
            for (Integer value : multimap.get(key)) {
                sum += value;
            }
        }
        System.out.println("Sum of values in multimap: " + sum);
        
        /* read */ java.util.Set<Integer> values = multimap.get("key");
        
        // Print the values
        for (Integer value : values) {
            System.out.println("Value from multimap: " + value);
        }
        
        // Additional calculations
        int product = 1;
        for (Integer value : values) {
            product *= value;
        }
        System.out.println("Product of values: " + product);
    }
}