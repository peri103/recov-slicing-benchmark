import org.jfree.chart.plot.PiePlot;

public class ChartSettings {
    private PiePlot plot;

    public ChartSettings() {
        this.plot = new PiePlot();
    }

    public void setMaximumLabelWidth(double width) {
        /* write */ plot.setMaximumLabelWidth(width);
    }

    public PiePlot getPlot() {
        return plot;
    }
}
