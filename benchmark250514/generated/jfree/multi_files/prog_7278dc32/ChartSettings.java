import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class ChartSettings {
    private PiePlot piePlot;

    public ChartSettings() {
        this.piePlot = new PiePlot();
    }

    public void setLabelOutlineColor(Color color) {
        /* write */ piePlot.setLabelOutlinePaint(color);
    }

    public PiePlot getPiePlot() {
        return piePlot;
    }
}
