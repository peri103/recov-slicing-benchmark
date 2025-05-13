import java.awt.Color;
import java.util.ArrayList;

public class ColorManager {
    private ArrayList<Color> colorList = new ArrayList<>();

    public ColorManager() {
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
    }

    public Color getColor(int index) {
        return colorList.get(index);
    }

    public void printColors() {
        for (Color color : colorList) {
            System.out.println("Color: " + color);
        }
    }

    public int sumRedValues() {
        int sum = 0;
        for (Color color : colorList) {
            sum += color.getRed();
        }
        return sum;
    }
}
