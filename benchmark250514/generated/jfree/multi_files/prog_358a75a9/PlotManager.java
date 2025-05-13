import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Paint;

public class PlotManager {
    private PiePlot piePlot = new PiePlot();
    private CategoryPlot categoryPlot = new CategoryPlot();
    private PaintManager paintManager;

    public PlotManager(PaintManager paintManager) {
        this.paintManager = paintManager;
    }

    public void initializePlots() {
        piePlot.setShadowPaint(paintManager.getPaint("PiePlot"));
        categoryPlot.setDomainGridlinePaint(paintManager.getPaint("CategoryPlot"));
    }

    public Paint getPiePlotShadowPaint() {
        /* read */ return piePlot.getShadowPaint();
    }

    public Paint getCategoryPlotGridlinePaint() {
        return categoryPlot.getDomainGridlinePaint();
    }
}
