import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class StrokeManager {
    private XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
    private Stroke initialStroke = new BasicStroke(2.0f);

    public StrokeManager() {
        /* write */ stepAreaRenderer.setSeriesStroke(0, initialStroke);
    }

    public void setSeriesStroke(int series, Stroke stroke) {
        stepAreaRenderer.setSeriesStroke(series, stroke);
    }

    public Stroke getSeriesStroke(int series) {
        return stepAreaRenderer.getSeriesStroke(series);
    }
}
