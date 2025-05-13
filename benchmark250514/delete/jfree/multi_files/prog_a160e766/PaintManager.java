import org.jfree.chart.plot.PiePlot;
import java.awt.Paint;
import java.awt.Color;

public class PaintManager {
    private PiePlot piePlot = new PiePlot();

    public void setLabelShadowPaint() {
        Paint shadowPaint = new Color(100, 100, 100); // Grey color
        /* write */ piePlot.setLabelShadowPaint(shadowPaint);
    }

    public Paint getLabelShadowPaint() {
        return piePlot.getLabelShadowPaint();
    }
}
