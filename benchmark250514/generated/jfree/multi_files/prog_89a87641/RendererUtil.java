import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class RendererUtil {
    private XYStepAreaRenderer renderer;
    private Stroke stroke;

    public RendererUtil() {
        this.renderer = new XYStepAreaRenderer();
        this.stroke = new BasicStroke(2.0f);
    }

    public void configureRenderer() {
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
    }

    public XYStepAreaRenderer getRenderer() {
        return this.renderer;
    }

    public Stroke getStroke() {
        return this.stroke;
    }
}
