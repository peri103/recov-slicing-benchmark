import com.google.common.collect.EnumMultiset;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> multiset = EnumMultiset.create(EnumSet.allOf(Color.class));

        // Create a map to store counts of different colors
        Map<Color, Integer> colorMap = new HashMap<>();

        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);

        // Add more elements to the multiset
        multiset.add(Color.GREEN);
        multiset.add(Color.BLUE);
        multiset.add(Color.RED);

        // Populate the map with counts from the multiset
        for (Color color : Color.values()) {
            colorMap.put(color, multiset.count(color));
        }

        // Perform some unrelated operations
        int totalColors = 0;
        for (Integer count : colorMap.values()) {
            totalColors += count;
        }
        System.out.println("Total colors counted: " + totalColors);

        // Count the occurrences of the element in the multiset
        /* read */ int count = multiset.count(Color.RED);

        // Print the count
        System.out.println("Count of RED: " + count);

        // Print counts of all colors from the map
        for (Map.Entry<Color, Integer> entry : colorMap.entrySet()) {
            System.out.println("Color " + entry.getKey() + " has count: " + entry.getValue());
        }
    }
}