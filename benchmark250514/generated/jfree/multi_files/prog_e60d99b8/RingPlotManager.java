import org.jfree.chart.plot.RingPlot;

public class RingPlotManager {
    private RingPlot plot;

    public RingPlotManager() {
        this.plot = new RingPlot();
    }

    public void setSectionDepth(double depth) {
        /* write */ plot.setSectionDepth(depth);
    }

    public double getSectionDepth() {
        return plot.getSectionDepth();
    }
}
