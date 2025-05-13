import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class PiePlotManager {
    private PiePlot plot;

    public PiePlotManager() {
        this.plot = new PiePlot();
    }

    public void setSectionOutline(String section, Color color) {
        /* write */ plot.setSectionOutlinePaint(section, color);
    }

    public Color getSectionOutline(String section) {
        return (Color) plot.getSectionOutlinePaint(section);
    }
}
