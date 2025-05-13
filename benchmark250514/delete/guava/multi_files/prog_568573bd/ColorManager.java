import java.util.HashMap;
import java.util.Map;

public class ColorManager {
    private ColorMultiset colorMultiset = new ColorMultiset();
    private Map<ColorMultiset.Color, Integer> colorMap = new HashMap<>();

    public void addColor(ColorMultiset.Color color) {
        colorMultiset.addColor(color);
    }

    public void updateColorCounts() {
        for (ColorMultiset.Color color : ColorMultiset.Color.values()) {
            colorMap.put(color, colorMultiset.countColor(color));
        }
    }

    public int getColorCount(ColorMultiset.Color color) {
        return colorMap.getOrDefault(color, 0);
    }

    public Map<ColorMultiset.Color, Integer> getAllColorCounts() {
        return colorMap;
    }
}