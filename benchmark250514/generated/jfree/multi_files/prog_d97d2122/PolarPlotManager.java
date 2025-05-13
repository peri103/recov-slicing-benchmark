import org.jfree.chart.plot.PolarPlot;
import java.awt.Paint;
import java.awt.Color;

public class PolarPlotManager {
    private PolarPlot plot;

    public PolarPlotManager() {
        plot = new PolarPlot();
    }

    public void setGridlinePaint(Paint paint) {
        /* write */ plot.setAngleGridlinePaint(paint);
    }

    public Paint getGridlinePaint() {
        return plot.getAngleGridlinePaint();
    }
}
