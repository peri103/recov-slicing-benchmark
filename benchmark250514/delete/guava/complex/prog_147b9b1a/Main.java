import com.google.common.collect.EnumMultiset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumMultiset instance with the Color enum
        EnumMultiset<Color> multiset = EnumMultiset.create(Arrays.asList(Color.RED, Color.GREEN, Color.BLUE));

        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);

        // Create a HashMap to store some data
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("RED", 1);
        colorMap.put("GREEN", 2);
        colorMap.put("BLUE", 3);

        // Perform some operations on the HashMap
        for (Map.Entry<String, Integer> entry : colorMap.entrySet()) {
            System.out.println("Color: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add more elements to the multiset
        multiset.add(Color.GREEN, 2);
        multiset.add(Color.BLUE, 3);

        // Calculate the total count of all elements in the multiset
        int totalCount = 0;
        for (Color color : Color.values()) {
            totalCount += multiset.count(color);
        }
        System.out.println("Total count of all colors: " + totalCount);

        // Read the count of the added element
        /* read */ int count = multiset.count(Color.RED);

        // Print the count
        System.out.println("Count of RED: " + count);

        // Another complex operation: calculate the average value from the colorMap
        int sum = 0;
        for (Integer value : colorMap.values()) {
            sum += value;
        }
        double average = sum / (double) colorMap.size();
        System.out.println("Average value in colorMap: " + average);
    }
}