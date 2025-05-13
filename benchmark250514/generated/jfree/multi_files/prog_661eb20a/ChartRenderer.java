import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class ChartRenderer {
    private XYDifferenceRenderer renderer;

    public ChartRenderer() {
        renderer = new XYDifferenceRenderer();
    }

    public void setPositiveColor(Color color) {
        /* write */ renderer.setPositivePaint(color);
    }

    public Paint getPositiveColor() {
        return renderer.getPositivePaint();
    }

    public void setNegativeColor(Color color) {
        renderer.setNegativePaint(color);
    }

    public Paint getNegativeColor() {
        return renderer.getNegativePaint();
    }
}