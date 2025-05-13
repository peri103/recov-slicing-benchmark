import org.jfree.chart.plot.Plot;
import java.awt.Paint;

public class PlotBackgroundManager {
    private Plot plot;

    public PlotBackgroundManager(Plot plot) {
        this.plot = plot;
    }

    public void setBackground(Paint paint) {
        /* write */ plot.setBackgroundPaint(paint);
    }

    public Paint getBackground() {
        return plot.getBackgroundPaint();
    }
}