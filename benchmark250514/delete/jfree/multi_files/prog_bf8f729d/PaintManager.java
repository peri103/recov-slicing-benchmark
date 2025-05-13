import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Paint;

public class PaintManager {
    private XYStepAreaRenderer renderer;

    public PaintManager() {
        this.renderer = new XYStepAreaRenderer();
    }

    public void setPaint(Paint paint) {
        /* write */ renderer.setDomainPaint(paint);
    }

    public Paint getPaint() {
        return renderer.getDomainPaint();
    }
}
