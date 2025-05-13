import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PiePlot;

public class PlotManager {
    private Plot plot;

    public PlotManager() {
        this.plot = new PiePlot();
        ((PiePlot) plot).setSectionOutlinesVisible(true);
    }

    public void configurePlot() {
        ((PiePlot) plot).setCircular(false);
        ((PiePlot) plot).setInteriorGap(0.04);
    }

    public Plot getPlot() {
        return plot;
    }
}
