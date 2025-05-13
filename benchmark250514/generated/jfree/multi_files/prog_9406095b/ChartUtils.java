import org.jfree.chart.renderer.xy.XYItemRenderer;
import java.awt.Color;

public class ChartUtils {
    private XYItemRenderer renderer;

    public ChartUtils(XYItemRenderer renderer) {
        this.renderer = renderer;
    }

    public void setSeriesColor(int series, Color color) {
        /* write */ renderer.setSeriesPaint(series, color);
    }
}