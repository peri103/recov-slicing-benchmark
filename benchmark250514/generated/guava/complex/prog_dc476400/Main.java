import com.google.common.collect.EnumHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize an EnumHashBiMap with a sample enum class
        EnumHashBiMap<Color, String> enumHashBiMap = EnumHashBiMap.create(Color.class);
        
        // Initialize a HashMap to store additional data
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Put some values into the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        
        // Use the write method to put a value into the EnumHashBiMap
        /* write */ enumHashBiMap.put(Color.RED, "Red");

        // Perform operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Initialize another EnumHashBiMap with a different enum class
        EnumHashBiMap<Shape, String> shapeBiMap = EnumHashBiMap.create(Shape.class);
        shapeBiMap.put(Shape.CIRCLE, "Circle");
        shapeBiMap.put(Shape.SQUARE, "Square");
        
        // Retrieve and print values from the shapeBiMap
        System.out.println("Shape: " + shapeBiMap.get(Shape.CIRCLE));
        System.out.println("Shape: " + shapeBiMap.get(Shape.SQUARE));

        // More operations on the HashMap
        hashMap.put("Three", 3);
        sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Updated sum of HashMap values: " + sum);

        // Use the read method to get the value from the EnumHashBiMap
        /* read */ String value = enumHashBiMap.get(Color.RED);

        // Print the value to ensure it was read correctly
        System.out.println("Color: " + value);
    }

    // Sample enum class to use with EnumHashBiMap
    private enum Color {
        RED, GREEN, BLUE
    }

    // Another sample enum class for demonstration
    private enum Shape {
        CIRCLE, SQUARE, TRIANGLE
    }
}