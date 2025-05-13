import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class ChartRenderer {
    private XYDifferenceRenderer renderer;

    public ChartRenderer() {
        this.renderer = new XYDifferenceRenderer();
    }

    public void setPositivePaint(Color color) {
        /* write */ renderer.setPositivePaint(color);
    }

    public Paint getPositivePaint() {
        return renderer.getPositivePaint();
    }
}