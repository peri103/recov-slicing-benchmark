import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class ChartSettings {
    private PiePlot plot;

    public ChartSettings() {
        this.plot = new PiePlot();
    }

    public void configurePlot() {
        Paint shadowPaint = new Color(100, 100, 100); // Example color for shadow paint
        /* write */ plot.setLabelShadowPaint(shadowPaint);
    }

    public PiePlot getPlot() {
        return plot;
    }
}
