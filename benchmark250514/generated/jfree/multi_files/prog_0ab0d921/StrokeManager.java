import org.jfree.chart.plot.PiePlot;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class StrokeManager {
    private PiePlot plot;

    public StrokeManager(PiePlot plot) {
        this.plot = plot;
    }

    public void setStrokeForSection(String section, Stroke stroke) {
        /* write */ plot.setSectionOutlineStroke(section, stroke);
    }
}
