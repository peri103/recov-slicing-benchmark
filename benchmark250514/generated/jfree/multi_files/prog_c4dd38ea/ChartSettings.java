import org.jfree.chart.plot.PiePlot;

public class ChartSettings {
    private PiePlot piePlot;

    public ChartSettings() {
        this.piePlot = new PiePlot();
    }

    public void setLabelWidth(double width) {
        /* write */ piePlot.setMaximumLabelWidth(width);
    }

    public PiePlot getPiePlot() {
        return piePlot;
    }
}