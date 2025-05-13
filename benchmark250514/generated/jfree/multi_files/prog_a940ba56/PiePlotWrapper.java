import org.jfree.chart.plot.PiePlot;

public class PiePlotWrapper {
    private PiePlot piePlot;

    public PiePlotWrapper() {
        this.piePlot = new PiePlot();
    }

    public void setMaxLabelWidth(double width) {
        /* write */ piePlot.setMaximumLabelWidth(width);
    }

    public double getMaxLabelWidth() {
        return piePlot.getMaximumLabelWidth();
    }
}
