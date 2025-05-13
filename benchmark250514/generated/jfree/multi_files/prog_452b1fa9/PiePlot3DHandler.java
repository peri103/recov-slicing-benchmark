import org.jfree.chart.plot.PiePlot3D;

public class PiePlot3DHandler {
    private PiePlot3D piePlot;

    public PiePlot3DHandler() {
        this.piePlot = new PiePlot3D();
    }

    public void setDepth(double depth) {
        /* write */ piePlot.setDepthFactor(depth);
    }

    public double getDepth() {
        return piePlot.getDepthFactor();
    }
}
