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

        // Create an EnumMultiset instance for the enum Color
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(EnumSet.allOf(Color.class));

        // Use the write method to add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Create another EnumMultiset for a different purpose
        EnumMultiset<Color> secondaryMultiset = EnumMultiset.create(EnumSet.allOf(Color.class));
        secondaryMultiset.add(Color.GREEN);
        secondaryMultiset.add(Color.BLUE);

        // Create a HashMap to store counts of colors
        Map<Color, Integer> colorCounts = new HashMap<>();
        colorCounts.put(Color.RED, colorMultiset.count(Color.RED));
        colorCounts.put(Color.GREEN, secondaryMultiset.count(Color.GREEN));
        colorCounts.put(Color.BLUE, secondaryMultiset.count(Color.BLUE));

        // Perform some operations on the map
        int totalColors = 0;
        for (Color color : colorCounts.keySet()) {
            totalColors += colorCounts.get(color);
        }

        System.out.println("Total color occurrences: " + totalColors);

        // More complex operations
        for (Color color : Color.values()) {
            if (colorCounts.containsKey(color)) {
                System.out.println(color + " is present " + colorCounts.get(color) + " times.");
            } else {
                System.out.println(color + " is not present.");
            }
        }

        // Use the read method to count the occurrences of the element added
        /* read */ int count = colorMultiset.count(Color.RED);

        // Print the count to verify the read operation
        System.out.println("Count of RED: " + count);
    }
}