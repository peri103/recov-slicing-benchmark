import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColorConfiguration {
    private Map<String, Color> colorMap;

    public ColorConfiguration() {
        colorMap = new HashMap<>();
        colorMap.put("positive", Color.GREEN);
        colorMap.put("negative", Color.RED);
    }

    public Color getColor(String type) {
        return colorMap.get(type);
    }

    public void printConfigurations() {
        for (Map.Entry<String, Color> entry : colorMap.entrySet()) {
            System.out.println("Configuring " + entry.getKey() + " color as " + entry.getValue());
        }
    }
}
