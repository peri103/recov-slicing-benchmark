import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.DialValueIndicator;

public class DialPlotWrapper {
    private DialPlot dialPlot;
    private DialValueIndicator indicator;

    public DialPlotWrapper() {
        this.dialPlot = new DialPlot();
        this.indicator = new DialValueIndicator(0);
        dialPlot.addLayer(indicator);
    }

    public void setupDialPlot() {
        indicator.setValue(10.5);
        dialPlot.setDialFrame(new org.jfree.chart.plot.dial.StandardDialFrame());
        dialPlot.setBackgroundPaint(java.awt.Color.LIGHT_GRAY);
        dialPlot.setForegroundAlpha(0.5f);
    }

    public DialPlot getDialPlot() {
        return dialPlot;
    }
}