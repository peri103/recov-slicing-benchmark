import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.util.ArrayList;

public class ColorManager {
    private XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
    private ArrayList<Color> colorList = new ArrayList<>();

    public ColorManager() {
        colorList.add(Color.RED);
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);

        for (int i = 0; i < colorList.size(); i++) {
            lineRenderer.setSeriesPaint(i, colorList.get(i));
        }
    }

    public Color getSeriesPaint(int index) {
        return (Color) lineRenderer.getSeriesPaint(index);
    }
}
