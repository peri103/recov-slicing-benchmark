import org.jfree.chart.plot.SpiderWebPlot;

public class PlotSettings {
    private SpiderWebPlot plot;

    public PlotSettings() {
        this.plot = new SpiderWebPlot(null); // Assuming null for dataset as we are not interacting with external systems
    }

    public void setHeadPercent(double percent) {
        /* write */ plot.setHeadPercent(percent);
    }

    public double getHeadPercent() {
        return plot.getHeadPercent();
    }
}