import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class RendererManager {
    private XYStepAreaRenderer renderer = new XYStepAreaRenderer();
    
    public void configureRenderer() {
        Stroke stroke = new BasicStroke(2.0f);
        /* write */ renderer.setSeriesStroke(0, stroke);
    }
    
    public Stroke getRendererStroke() {
        return renderer.getSeriesStroke(0);
    }
}
