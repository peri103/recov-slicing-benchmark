import org.jfree.chart.plot.PiePlot;

public class ChartConfiguration {
    private PiePlot piePlot;

    public ChartConfiguration() {
        piePlot = new PiePlot();
    }

    public void configurePiePlot() {
        piePlot.setCircular(true);
        piePlot.setIgnoreNullValues(true);
        /* write */ piePlot.setSectionOutlinesVisible(true);
    }

    public PiePlot getPiePlot() {
        return piePlot;
    }
}
