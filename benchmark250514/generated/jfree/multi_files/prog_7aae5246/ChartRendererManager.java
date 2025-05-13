import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class ChartRendererManager {
    private XYPlot plot;

    public ChartRendererManager() {
        plot = new XYPlot();
    }

    public void configureRenderer(XYItemRenderer renderer) {
        /* write */ plot.setRenderer(renderer);
    }

    public XYPlot getPlot() {
        return plot;
    }
}
