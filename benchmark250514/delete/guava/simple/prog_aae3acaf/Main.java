import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Assume we have an enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        // Create an EnumHashBiMap instance
        EnumHashBiMap<Color, String> map = EnumHashBiMap.create(Color.class);

        // Write a value to the map
        /* write */ map.put(Color.RED, "Red Color");

        // Read the value from the map
        /* read */ String value = map.get(Color.RED);

        // Print the value
        System.out.println(value);
    }
}