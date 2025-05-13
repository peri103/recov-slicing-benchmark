import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.dial.DialNeedle;

public class CompassPlotWrapper {
    private CompassPlot compassPlot;
    private DialNeedle needle;

    public CompassPlotWrapper() {
        this.compassPlot = new CompassPlot();
        this.needle = new DialNeedle();
    }

    public void setNeedle() {
        /* write */ compassPlot.setSeriesNeedle(0, needle);
    }

    public DialNeedle getNeedle() {
        return compassPlot.getSeriesNeedle(0);
    }

    public CompassPlot getCompassPlot() {
        return compassPlot;
    }
}