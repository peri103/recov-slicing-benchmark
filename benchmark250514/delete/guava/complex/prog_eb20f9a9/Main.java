import com.google.common.collect.EnumMultiset;
import com.google.common.collect.HashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Initialize an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);
        
        // Initialize another Multiset for demonstration purposes
        HashMultiset<String> fruitMultiset = HashMultiset.create();
        
        // Initialize a Map for additional complexity
        Map<String, Integer> fruitMap = new HashMap<>();
        
        /* write */ colorMultiset.add(Color.RED);
        
        // Add elements to the fruitMultiset
        fruitMultiset.add("Apple");
        fruitMultiset.add("Banana");
        fruitMultiset.add("Apple");
        
        // Populate the Map with some values
        fruitMap.put("Apple", 2);
        fruitMap.put("Banana", 1);
        
        // Perform operations using the fruitMultiset
        int appleCount = fruitMultiset.count("Apple");
        int bananaCount = fruitMultiset.count("Banana");
        
        // Perform operations using the Map
        int appleInMap = fruitMap.get("Apple");
        int bananaInMap = fruitMap.get("Banana");
        
        // Output the counts from fruitMultiset
        System.out.println("Count of Apple in fruitMultiset: " + appleCount);
        System.out.println("Count of Banana in fruitMultiset: " + bananaCount);
        
        // Output the values from the Map
        System.out.println("Count of Apple in fruitMap: " + appleInMap);
        System.out.println("Count of Banana in fruitMap: " + bananaInMap);
        
        // Perform some unrelated operations for complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ int count = colorMultiset.count(Color.RED);
        
        // Output the count to verify the read operation
        System.out.println("Count of RED in colorMultiset: " + count);
    }
}