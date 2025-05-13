import org.jfree.chart.plot.PiePlot;

public class ChartSettings {
    private PiePlot piePlot;

    public ChartSettings() {
        this.piePlot = new PiePlot();
    }

    public void configurePiePlot() {
        piePlot.setCircular(true);
        piePlot.setBackgroundAlpha(0.5f);
        piePlot.setIgnoreNullValues(true);
        /* write */ piePlot.setLabelGap(0.05);
    }

    public PiePlot getPiePlot() {
        return this.piePlot;
    }
}
