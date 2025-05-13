import com.google.common.collect.EnumMultiset;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Color.class);

        // Add an element to the EnumMultiset
        /* write */ colorMultiset.add(Color.RED);

        // Create a HashMap to store some data
        HashMap<String, Integer> colorMap = new HashMap<>();
        colorMap.put("RED", 1);
        colorMap.put("GREEN", 2);
        colorMap.put("BLUE", 3);

        // Perform some unrelated operations
        int sum = 0;
        for (String key : colorMap.keySet()) {
            sum += colorMap.get(key);
        }
        System.out.println("Sum of values in colorMap: " + sum);

        // Calculate the count of a different enum value
        int greenCount = colorMultiset.count(Color.GREEN);
        System.out.println("Count of GREEN in colorMultiset: " + greenCount);

        // Read the count of the element added
        /* read */ int count = colorMultiset.count(Color.RED);

        // Print the count to verify the read operation
        System.out.println("Count of RED in colorMultiset: " + count);

        // Add more elements to EnumMultiset
        colorMultiset.add(Color.GREEN);
        colorMultiset.add(Color.BLUE);

        // Print counts for all colors
        for (Color color : Color.values()) {
            System.out.println("Count of " + color + " in colorMultiset: " + colorMultiset.count(color));
        }
    }
}