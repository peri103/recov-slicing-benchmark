import com.google.common.collect.EnumMultiset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color { RED, GREEN, BLUE }

        // Initialize EnumMultiset with the Color enum type
        EnumMultiset<Color> multiset = EnumMultiset.create(Arrays.asList(Color.values()));
        
        // Create a map to store counts of colors
        Map<Color, Integer> colorMap = new HashMap<>();
        for (Color color : Color.values()) {
            colorMap.put(color, 0);
        }

        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);

        // Perform some operations on the map
        for (Color color : Color.values()) {
            int count = multiset.count(color);
            colorMap.put(color, count);
        }

        // Add more elements to the multiset
        multiset.add(Color.GREEN);
        multiset.add(Color.BLUE);
        multiset.add(Color.RED);

        // Update map with new counts
        for (Color color : Color.values()) {
            int count = multiset.count(color);
            colorMap.put(color, count);
        }

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Get the count of the element added
        /* read */ int redCount = multiset.count(Color.RED);

        // Print the count to verify the operation
        System.out.println("Count of RED in multiset: " + redCount);

        // Print counts from the map
        for (Map.Entry<Color, Integer> entry : colorMap.entrySet()) {
            System.out.println("Color: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}