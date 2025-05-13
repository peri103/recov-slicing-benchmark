import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class ChartUtils {
    private BarRenderer barRenderer = new BarRenderer();
    private Map<Integer, Color> colorMap = new HashMap<>();

    public ChartUtils() {
        colorMap.put(0, Color.RED);
        colorMap.put(1, Color.BLUE);
        colorMap.put(2, Color.GREEN);
    }

    public void initializeRenderer() {
        for (Map.Entry<Integer, Color> entry : colorMap.entrySet()) {
            /* write */ barRenderer.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }
    }

    public Paint getOutlinePaint(int series) {
        return barRenderer.getSeriesOutlinePaint(series);
    }

    public Map<Integer, Color> getColorMap() {
        return colorMap;
    }
}
