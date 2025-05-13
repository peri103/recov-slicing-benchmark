import com.google.common.collect.EnumMultiset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset for the Color enum
        EnumMultiset<Color> colorMultiset = EnumMultiset.create(Arrays.asList(Color.class.getEnumConstants()));

        // Add an element to the multiset
        /* write */ colorMultiset.add(Color.RED);

        // Create a HashMap to store some data
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("RED", 1);
        colorMap.put("GREEN", 2);
        colorMap.put("BLUE", 3);

        // Perform some operations on the HashMap
        int greenValue = colorMap.get("GREEN");
        System.out.println("Value associated with GREEN: " + greenValue);

        // Add more elements to the EnumMultiset
        colorMultiset.add(Color.GREEN);
        colorMultiset.add(Color.BLUE);
        colorMultiset.add(Color.RED);

        // Iterate through the EnumMultiset and print counts
        for (Color color : Color.values()) {
            int count = colorMultiset.count(color);
            System.out.println("Count of " + color + ": " + count);
        }

        // Count the occurrences of an element in the multiset
        /* read */ int redCount = colorMultiset.count(Color.RED);

        // Print the count
        System.out.println("Final count of RED: " + redCount);
    }
}