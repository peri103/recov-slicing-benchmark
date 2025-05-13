import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class StrokeManager {
    private XYStepAreaRenderer stepAreaRenderer;

    public StrokeManager() {
        this.stepAreaRenderer = new XYStepAreaRenderer();
    }

    public void setOutlineStroke(float thickness) {
        Stroke stroke = new BasicStroke(thickness);
        /* write */ stepAreaRenderer.setOutlineStroke(stroke);
    }

    public Stroke getOutlineStroke() {
        return stepAreaRenderer.getOutlineStroke();
    }
}
