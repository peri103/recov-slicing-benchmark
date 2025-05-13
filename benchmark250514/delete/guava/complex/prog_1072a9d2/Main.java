import com.google.common.collect.EnumMultiset;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Define an enum to use with EnumMultiset
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);

        /* write */ colorMultiset.add(Color.RED);

        // Create a HashMap to store counts of different colors
        HashMap<Color, Integer> colorCountMap = new HashMap<>();

        // Add some colors to the map
        colorCountMap.put(Color.RED, 10);
        colorCountMap.put(Color.GREEN, 5);
        colorCountMap.put(Color.BLUE, 8);

        // Perform some operations on the map
        int greenCount = colorCountMap.get(Color.GREEN);
        System.out.println("Initial count of GREEN: " + greenCount);

        // Update the count for GREEN
        colorCountMap.put(Color.GREEN, greenCount + 2);

        // Print updated counts
        for (Color color : colorCountMap.keySet()) {
            System.out.println("Count of " + color + ": " + colorCountMap.get(color));
        }

        // Use EnumMultiset to count colors again
        colorMultiset.add(Color.GREEN);
        colorMultiset.add(Color.BLUE);
        colorMultiset.add(Color.GREEN);

        // Perform some unrelated operations
        int totalColors = 0;
        for (Color color : Color.values()) {
            totalColors += colorMultiset.count(color);
        }
        System.out.println("Total colors counted: " + totalColors);

        /* read */ int count = colorMultiset.count(Color.RED);

        System.out.println("Count of RED: " + count);

        // More complex operations
        int blueCount = colorMultiset.count(Color.BLUE);
        System.out.println("Count of BLUE: " + blueCount);

        // Calculate the average count of colors
        double averageCount = (double) totalColors / Color.values().length;
        System.out.println("Average count of colors: " + averageCount);
    }
}