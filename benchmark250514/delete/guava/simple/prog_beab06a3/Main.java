import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Assuming a simple enum for demonstration purposes
        enum Color {
            RED, GREEN, BLUE
        }

        EnumHashBiMap<Color, String> map = EnumHashBiMap.create(Color.class);
        /* write */ map.put(Color.RED, "Red Color");
        /* read */ String value = map.get(Color.RED);
        System.out.println(value);
    }
}