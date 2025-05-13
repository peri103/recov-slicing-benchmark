import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ColorPalette {
    private List<Color> colors;

    public ColorPalette() {
        colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
    }

    public Color getColor(int index) {
        if (index >= 0 && index < colors.size()) {
            return colors.get(index);
        }
        return null;
    }

    public void addColor(Color color) {
        colors.add(color);
    }

    public List<Color> getAllColors() {
        return colors;
    }
}