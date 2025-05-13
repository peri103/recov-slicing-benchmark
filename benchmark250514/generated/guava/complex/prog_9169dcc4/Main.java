import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableListMultimap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", "value");
        
        // Create an ImmutableListMultimap and add some key-value pairs
        ImmutableListMultimap.Builder<String, Integer> listMultimapBuilder = ImmutableListMultimap.builder();
        listMultimapBuilder.put("numbers", 1);
        listMultimapBuilder.put("numbers", 2);
        listMultimapBuilder.put("numbers", 3);
        ImmutableListMultimap<String, Integer> listMultimap = listMultimapBuilder.build();
        
        // Process the values from the ImmutableListMultimap
        ArrayList<Integer> numberList = new ArrayList<>(listMultimap.get("numbers"));
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        // Perform some unrelated operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Read the value associated with the key
        /* read */ java.util.Set<String> values = multimap.get("key");
        
        // Print the values
        System.out.println(values);
    }
}