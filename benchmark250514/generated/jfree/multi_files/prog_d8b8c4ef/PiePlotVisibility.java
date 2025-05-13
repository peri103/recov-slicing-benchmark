import org.jfree.chart.plot.PiePlot;

public class PiePlotVisibility {
    private PiePlot piePlot;

    public PiePlotVisibility() {
        piePlot = new PiePlot();
    }

    public void setOutlinesVisible(boolean visible) {
        /* write */ piePlot.setSectionOutlinesVisible(visible);
    }

    public boolean getOutlinesVisible() {
        return piePlot.getSectionOutlinesVisible();
    }
}
