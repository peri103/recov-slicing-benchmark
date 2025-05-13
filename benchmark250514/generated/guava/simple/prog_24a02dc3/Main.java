import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize EnumHashBiMap with a sample Enum class
        EnumHashBiMap<Color, String> map = EnumHashBiMap.create(Color.class);

        /* write */ map.put(Color.RED, "Red Color");
        /* read */ String value = map.get(Color.RED);
        
        System.out.println(value);
    }

    // Sample Enum class for demonstration
    private enum Color {
        RED, GREEN, BLUE
    }
}