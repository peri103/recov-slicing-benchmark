import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class StrokeManager {
    private XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
    private Stroke stepStroke = new BasicStroke(2.0f);

    public StrokeManager() {
        /* write */ stepAreaRenderer.setSeriesStroke(0, stepStroke);
    }

    public Stroke getStepStroke() {
        return stepStroke;
    }

    public Stroke getRendererStroke() {
        return stepAreaRenderer.getSeriesStroke(0);
    }
}
