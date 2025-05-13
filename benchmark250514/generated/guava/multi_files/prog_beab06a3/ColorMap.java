import com.google.common.collect.EnumHashBiMap;

public class ColorMap {
    enum Color {
        RED, GREEN, BLUE
    }

    private EnumHashBiMap<Color, String> map = EnumHashBiMap.create(Color.class);

    public void addColorMapping(Color color, String description) {
        /* write */ map.put(color, description);
    }

    public String getColorDescription(Color color) {
        return map.get(color);
    }
}
