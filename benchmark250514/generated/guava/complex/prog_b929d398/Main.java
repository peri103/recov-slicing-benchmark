import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableSortedSet using its builder
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.builder();
        
        /* write */ builder.add(1);
        
        // Additional code to make the program more complex
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple").add("banana").add("cherry");
        ImmutableList<String> fruitList = listBuilder.build();
        
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("apple", 100);
        fruitPrices.put("banana", 50);
        fruitPrices.put("cherry", 75);
        
        for (String fruit : fruitList) {
            System.out.println("Fruit: " + fruit + ", Price: " + fruitPrices.get(fruit));
        }
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ boolean containsValue = set.contains(1);
        
        System.out.println(containsValue); // This should print true
        
        // More unrelated operations
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println("Index " + i + ": " + fruitList.get(i));
        }
        
        // Final operations
        fruitPrices.forEach((key, value) -> {
            System.out.println("Fruit: " + key + ", Value: " + value);
        });
    }
}