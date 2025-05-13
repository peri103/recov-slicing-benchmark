import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class XYStepAreaRendererWrapper {
    private XYStepAreaRenderer renderer;

    public XYStepAreaRendererWrapper() {
        this.renderer = new XYStepAreaRenderer();
    }

    public void setCustomDomainPaint(Color color) {
        /* write */ renderer.setDomainPaint(color);
    }

    public Paint getCustomDomainPaint() {
        return renderer.getDomainPaint();
    }
}
