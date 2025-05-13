import org.jfree.chart.plot.PiePlot;

public class PiePlotWrapper {
    private PiePlot piePlot = new PiePlot();

    public void setLabelGap(double gap) {
        /* write */ piePlot.setLabelGap(gap);
    }

    public double getLabelGap() {
        return piePlot.getLabelGap();
    }
}
