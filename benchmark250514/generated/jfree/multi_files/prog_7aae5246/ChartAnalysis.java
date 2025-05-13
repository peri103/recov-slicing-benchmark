import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class ChartAnalysis {
    private XYPlot plot;

    public ChartAnalysis(XYPlot plot) {
        this.plot = plot;
    }

    public XYItemRenderer analyzeRenderer() {
        /* read */ return plot.getRenderer();
    }
}
