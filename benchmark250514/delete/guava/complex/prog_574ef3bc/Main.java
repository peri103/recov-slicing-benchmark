import com.google.common.collect.EnumMultiset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color {
            RED, GREEN, BLUE, YELLOW, ORANGE
        }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);

        // Add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Create another EnumMultiset and add multiple elements
        EnumMultiset<Color> anotherMultiset = EnumMultiset.create(Color.class);
        anotherMultiset.add(Color.GREEN);
        anotherMultiset.add(Color.BLUE);
        anotherMultiset.add(Color.GREEN);

        // Use a HashMap to store counts of colors
        Map<Color, Integer> colorCountMap = new HashMap<>();
        for (Color color : Color.values()) {
            colorCountMap.put(color, anotherMultiset.count(color));
        }

        // Perform some operations on the map
        colorCountMap.put(Color.YELLOW, 5);
        colorCountMap.put(Color.ORANGE, 3);

        // Print the entire map to check the counts
        System.out.println("Color counts in anotherMultiset:");
        for (Map.Entry<Color, Integer> entry : colorCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Add more elements to the original multiset
        colorMultiset.add(Color.BLUE);
        colorMultiset.add(Color.GREEN);

        // Perform some calculations
        int totalColors = colorMultiset.elementSet().size();
        System.out.println("Total different colors in colorMultiset: " + totalColors);

        // Read the count of the element added
        /* read */ int count = colorMultiset.count(Color.RED);

        // Print the count to verify the read operation
        System.out.println("Count of RED in colorMultiset: " + count);

        // Perform additional operations
        int totalElements = colorMultiset.size();
        System.out.println("Total elements in colorMultiset: " + totalElements);

        // Check if a color exists in the multiset
        boolean hasYellow = colorMultiset.contains(Color.YELLOW);
        System.out.println("Does colorMultiset contain YELLOW? " + hasYellow);
    }
}