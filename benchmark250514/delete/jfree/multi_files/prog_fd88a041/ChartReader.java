import org.jfree.chart.plot.PiePlot;
import java.awt.Paint;

public class ChartReader {
    private PiePlot plot;

    public ChartReader(PiePlot plot) {
        this.plot = plot;
    }

    public void displayShadowPaint() {
        /* read */ Paint readShadowPaint = plot.getLabelShadowPaint();
        System.out.println("Original Plot Label Shadow Paint: " + readShadowPaint);
    }
}
