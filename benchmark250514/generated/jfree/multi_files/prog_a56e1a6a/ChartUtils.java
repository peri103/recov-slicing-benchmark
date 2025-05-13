import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class ChartUtils {
    private PiePlot plot;

    public ChartUtils() {
        plot = new PiePlot();
    }

    public void setSectionOutlineColor(String sectionName, Color color) {
        /* write */ plot.setSectionOutlinePaint(sectionName, color);
    }

    public PiePlot getPlot() {
        return plot;
    }
}
