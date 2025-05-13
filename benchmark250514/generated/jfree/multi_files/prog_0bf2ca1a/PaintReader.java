import org.jfree.chart.plot.PiePlot;
import java.awt.Paint;

public class PaintReader {
    private PiePlot piePlot;

    public PaintReader(PiePlot piePlot) {
        this.piePlot = piePlot;
    }

    public Paint readSectionPaint(Comparable key) {
        /* read */ return piePlot.getSectionPaint(key);
    }
}
