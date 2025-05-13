import org.jfree.chart.plot.PiePlot;

public class ChartAnalyzer {
    private PiePlot piePlot;

    public ChartAnalyzer(PiePlot piePlot) {
        this.piePlot = piePlot;
    }

    public double analyzeLabelWidth() {
        /* read */ return piePlot.getMaximumLabelWidth();
    }
}