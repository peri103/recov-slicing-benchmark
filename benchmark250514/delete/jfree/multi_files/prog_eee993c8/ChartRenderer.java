import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;

public class ChartRenderer {
    private XYStepAreaRenderer renderer = new XYStepAreaRenderer();

    public void setDomainPaint(Color color) {
        /* write */ renderer.setDomainPaint(color);
    }

    public Color getDomainPaint() {
        return (Color) renderer.getDomainPaint();
    }
}