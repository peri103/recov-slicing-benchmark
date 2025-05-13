import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an EnumHashBiMap with a sample enum class
        EnumHashBiMap<Color, String> enumHashBiMap = EnumHashBiMap.create(Color.class);
        
        // Use the write method to put a value into the map
        /* write */ enumHashBiMap.put(Color.RED, "Red");

        // Use the read method to get the value from the map
        /* read */ String value = enumHashBiMap.get(Color.RED);

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }

    // Sample enum class to use with EnumHashBiMap
    private enum Color {
        RED, GREEN, BLUE
    }
}