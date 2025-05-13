import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSetMultimap.Builder;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder as ListBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSetMultimap
        Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key1", "value1");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        // Create a new ImmutableListMultimap
        ListBuilder<String, Integer> listBuilder = ImmutableListMultimap.builder();
        listBuilder.put("numbers", 1);
        listBuilder.put("numbers", 2);
        listBuilder.put("numbers", 3);
        ImmutableListMultimap<String, Integer> listMultimap = listBuilder.build();
        
        // Retrieve values from ImmutableListMultimap
        java.util.List<Integer> numbers = listMultimap.get("numbers");
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Intermediate code to make the program more complex
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Retrieve the value associated with "key1"
        /* read */ java.util.Set<String> values = multimap.get("key1");
        
        // Print the retrieved values
        for (String value : values) {
            System.out.println("Retrieved Value: " + value);
        }
        
        // More complex operations
        for (String item : arrayList) {
            System.out.println("ArrayList Item: " + item);
        }
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}