import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class PiePlotManager {
    private PiePlot plot;

    public PiePlotManager() {
        plot = new PiePlot();
    }

    public void configurePlot() {
        plot.setSectionPaint("Section1", Color.BLUE);
        plot.setSectionOutlinePaint("Outline", Color.GRAY);
        /* write */ plot.setLabelBackgroundPaint(Color.RED);
    }

    public PiePlot getPlot() {
        return plot;
    }
}