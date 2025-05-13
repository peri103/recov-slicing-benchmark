import org.jfree.chart.plot.PiePlot;
import java.awt.Paint;
import java.awt.Color;

public class PiePlotWrapper {
    private PiePlot piePlot;

    public PiePlotWrapper() {
        piePlot = new PiePlot();
    }

    public void setLabelPaint() {
        Paint labelPaint = new Color(255, 0, 0); // Red color
        /* write */ piePlot.setLabelPaint(labelPaint);
    }

    public Paint getLabelPaint() {
        return piePlot.getLabelPaint();
    }
}
